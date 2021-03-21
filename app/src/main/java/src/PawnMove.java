package src;

import src.Pieces.Piece;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PawnMove implements MovePiece{
    private List<Position> movePositions = new ArrayList<>();

    /**
     * Return a List of Positions with all possible moves of Pawn
     * @param piece the Pawn piece
     * @return movePoints List of Points of moves
     */
    public List<Position> getPossibleMoves(Piece piece) {
        int oneMove = piece.getInitPosY() + 1;
        int doubleMove = piece.getInitPosY() + 2;
        int xDiagonalMLeft = piece.getInitPosX() - 1;
        int xDiagonalMRight = piece.getInitPosX() + 1;
        int yDiagonalM = piece.getInitPosY() -1;
        if(piece.getColorWhite()) {
            oneMove = piece.getInitPosY() -1;
            doubleMove = piece.getInitPosY() -2;
            yDiagonalM = piece.getInitPosY() + 1;
        }
        if(!piece.isMoved()) {
            if(isSpaceEmpty(Chessboard.board[piece.getInitPosX()][doubleMove]))
                movePositions.add(new Position(piece.getInitPosX(), doubleMove));
        }
        if(isSpaceEmpty(Chessboard.board[piece.getInitPosX()][oneMove])) {
            if(0 <= (piece.getInitPosY() + oneMove) && (piece.getInitPosY() + oneMove) < Chessboard.DIMENSION)  {
                movePositions.add(new Position(piece.getInitPosX(), oneMove));
            }
        }
        if(isSpaceWithEnemy(Chessboard.board[xDiagonalMLeft][yDiagonalM], piece.getColorWhite())) {
            movePositions.add(new Position(xDiagonalMLeft, yDiagonalM));
        }
        if(isSpaceWithEnemy(Chessboard.board[xDiagonalMRight][yDiagonalM], piece.getColorWhite())) {
            movePositions.add(new Position(xDiagonalMRight, yDiagonalM));
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
        if(piece.getColorWhite() == isWhite)
            return true;
        return false;
    }
}