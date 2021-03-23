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
        int yOneMove = piece.getInitPosY() + 1;
        int yDoubleMove = piece.getInitPosY() + 2;
        int xDiagonalMLeft = piece.getInitPosX() - 1;
        int xDiagonalMRight = piece.getInitPosX() + 1;

        if(piece.getColorWhite()) {
            yOneMove =  piece.getInitPosY() - 1;
            yDoubleMove = piece.getInitPosY() - 2;
        }
        if(!piece.isMoved()) {
            if(isSpaceEmpty(Chessboard.board[yDoubleMove][piece.getInitPosX()]))
                movePositions.add(new Position(piece.getInitPosX(), yDoubleMove));
        }
        if( isInLimits(yOneMove)){
            if(isSpaceEmpty(Chessboard.board[yOneMove][piece.getInitPosX()])) {
                movePositions.add(new Position(piece.getInitPosX(), yOneMove));
            }
            if(isInLimits(xDiagonalMLeft)) {
                if(isSpaceWithEnemy(Chessboard.board[yOneMove][xDiagonalMLeft], piece.getColorWhite())) {
                    movePositions.add(new Position(xDiagonalMLeft, yOneMove));
                }
            }
            if(isInLimits(xDiagonalMRight)) {
                if(isSpaceWithEnemy(Chessboard.board[yOneMove][xDiagonalMRight], piece.getColorWhite())) {
                    movePositions.add(new Position(xDiagonalMRight, yOneMove));
                }
            }
        }
        return movePositions;
    }

    /**
     *  Verify if the space of destination is free from piece of the same color or is empty.
     * @param piece is the piece in the possible position.
     * @return true is space is empty or has a piece of different color, false if has piece of same color
     */
    public boolean isSpaceEmpty(Piece piece) {
        if(piece == null)
            return true;
        return false;
    }

    /**
     *  Verify if Destiny position has an enemy
     * @param piece
     * @param isWhite
     * @return
     */
    public boolean isSpaceWithEnemy(Piece piece, boolean isWhite) {
        if(piece != null && piece.getColorWhite() != isWhite)
            return true;
        else
            return false;
    }

    /**
     *  Verify is the Position is inside the Limits of the Chessboard
     * @param position
     * @return true if its in the limits, false if not
     */
    @Override
    public boolean isInLimits(int position) {
        if(0 <= position && position < Chessboard.DIMENSION) {
            return true;
        }
        return false;
    }
}