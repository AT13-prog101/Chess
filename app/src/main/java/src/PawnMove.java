package src;

import src.Pieces.Piece;
import java.util.ArrayList;
import java.util.List;

public class PawnMove implements MovePiece{
    /**
     * Return a List of Positions with all possible moves of Pawn
     * @param piece the Pawn piece
     * @return movePoints List of Points of moves
     */
    public List<Position> getPossibleMoves(Piece piece) {
        List<Position> movePositions = new ArrayList<>();
        int oneMove = piece.getInitPosY() + 1;
        int doubleMove = piece.getInitPosY() + 2;
        int xDiagonalMLeft = piece.getInitPosX() - 1;
        int xDiagonalMRight = piece.getInitPosX() + 1;
        if(piece.getColorWhite()) {
            oneMove = piece.getInitPosY() -1;
            doubleMove = piece.getInitPosY() -2;
        }
        if(!piece.isMoved()) {
            if(isSpaceEmpty(Chessboard.board[doubleMove][piece.getInitPosX()]))
                movePositions.add(new Position(piece.getInitPosX(), doubleMove));
        }
        if(isSpaceEmpty(Chessboard.board[oneMove][piece.getInitPosX()])) {
            if(0 <= oneMove && oneMove < Chessboard.DIMENSION)  {
                movePositions.add(new Position(piece.getInitPosX(), oneMove));
            }
        }
        if(0 <= oneMove && oneMove < Chessboard.DIMENSION && 0 <= xDiagonalMLeft && xDiagonalMLeft < Chessboard.DIMENSION) {
            if(isSpaceWithEnemy(Chessboard.board[oneMove][xDiagonalMLeft], piece.getColorWhite())) {
                movePositions.add(new Position(xDiagonalMLeft, oneMove));
            }
        }
        if(0 <= oneMove && oneMove < Chessboard.DIMENSION && 0 <= xDiagonalMRight && xDiagonalMRight < Chessboard.DIMENSION) {
            if(isSpaceWithEnemy(Chessboard.board[oneMove][xDiagonalMRight], piece.getColorWhite())) {
                movePositions.add(new Position(xDiagonalMRight, oneMove));
            }
        }
        return movePositions;
    }

    /**
     *  Verify if the space of destination is free from piece of the same color or is empty.
     * @param piece is the piece in the possible position.
     * @return true is space is empty or has a piece of different color, false if has piece of same color
     */
    private boolean isSpaceEmpty(Piece piece) {
        return piece == null;
    }

    /**
     *  Verify if there are enemy pieces in diagonal of Pawn
     * @param piece is the piece in the possible position
     * @param isWhite the color of the Pawn
     * @return true if there is an enemy, false if not
     */
    private boolean isSpaceWithEnemy(Piece piece, boolean isWhite) {
        if(piece != null && piece.getColorWhite() != isWhite)
            return true;
        return false;
    }
}