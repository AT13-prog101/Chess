package src.Pieces;

import org.checkerframework.checker.units.qual.A;
import src.Chessboard;
import src.PositionTraductor;

import java.util.List;
import java.util.ArrayList;

public class BlackPawnMove implements MoveType{
    ArrayList<String> validMoves = new ArrayList<String>();
    public BlackPawnMove() {
    }
    public ArrayList<String> getValidMoves(String position) {
        PositionTraductor positionTraductor = new PositionTraductor();
        int col = positionTraductor.getXIndexNotation(position);
        int row = positionTraductor.getYIndexNotation(position);

        String moveOneSquare = positionTraductor.getAlgebraicNotation(col, row + 1);
        String moveTwoSquares = positionTraductor.getAlgebraicNotation(col, row + 2);
        String moveDiagonalLeft = positionTraductor.getAlgebraicNotation(col - 1, row + 1);
        String moveDiagonalRight = positionTraductor.getAlgebraicNotation(col + 1, row + 1);

        Piece pieceMoveForwardOnce = null;
        Piece pieceMoveForwardTwice = null;
        Piece pieceMoveDiagonalLeft = null;
        Piece pieceMoveDiagonalRight = null;
        if (row + 1 < Chessboard.DIMENSION) {
            pieceMoveForwardOnce = Chessboard.board[col][row + 1];
            if (pieceMoveForwardOnce == null) {
                validMoves.add(moveOneSquare);
            }
        }
        if (pieceMoveForwardOnce == null && row == 1) {
            pieceMoveForwardTwice = Chessboard.board[col][row + 2];
            if (pieceMoveForwardTwice == null) {
                validMoves.add(moveTwoSquares);
            }
        }
        if (row + 1 < Chessboard.DIMENSION && col - 1 >= 0) {
            pieceMoveDiagonalLeft = Chessboard.board[col - 1][row + 1];
            if (pieceMoveDiagonalLeft != null && pieceMoveDiagonalLeft.getColor() == 'W') {
                validMoves.add(moveDiagonalLeft);
            }
        }
        if (row + 1 < Chessboard.DIMENSION && col + 1 <Chessboard.DIMENSION) {
            pieceMoveDiagonalRight = Chessboard.board[col + 1][row + 1];
            if (pieceMoveDiagonalRight != null && pieceMoveDiagonalRight.getColor() == 'W') {
                validMoves.add(moveDiagonalRight);
            }
        }
        return validMoves;
    }
}
