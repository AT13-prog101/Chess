package src;

import src.Pieces.Piece;
import java.util.ArrayList;
import java.util.List;

public class KnightMove implements MovePiece{
    private List<Position> movePositions = new ArrayList<>();

    /**
     * Return a List of Positions with all possible moves of Knight
     * @param piece the Knight piece
     * @return movePoints List of Points of moves
     */
    @Override
    public List<Position> getPossibleMoves(Piece piece) {

        int[] xKnightMoves = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yKnightMoves = {1, 2, 2, 1, -1, -2, -2, -1};

        int xActPos = piece.getInitPosX();
        int yActPos = piece.getInitPosY();

        for(int i = 0; i < xKnightMoves.length ; i++) {
            int xPosition = xActPos + xKnightMoves[i];
            int yPosition = yActPos + yKnightMoves[i];
            if (0 < xPosition && 0 < yPosition &&xPosition < Chessboard.DIMENSION && yPosition < Chessboard.DIMENSION) {
                if(isSpaceEmpty(Chessboard.board[xPosition][yPosition], piece.getColorWhite())) {
                    movePositions.add(new Position(xPosition, yPosition));
                }
            }
        }
        return movePositions;
    }

    /**
     *  Verify if the space of destination is free from piece of the same color or is empty.
     * @param piece is the piece in the possible position.
     * @param isWhite is the color of the Knight that is moving
     * @return true is space is empty or has a piece of different color, false if has piece of same color
     */
    private boolean isSpaceEmpty(Piece piece, boolean isWhite) {
        if(piece == null || piece.getColorWhite() != isWhite)
            return true;
        return false;
    }

    /**
     *  Verify is destiny space is occupied with Enemy piece
     * @param piece Knight piece
     * @param isWhite Knight color
     * @return true if space with enemy piece, false if not
     */
    public boolean isSpaceWithEnemy(Piece piece, boolean isWhite) {
        if(piece.getColorWhite() == isWhite)
            return true;
        return false;
    }
}