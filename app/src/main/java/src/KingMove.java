package src;

import src.Pieces.Piece;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class KingMove implements MovePiece{
    private List<Point> movePoints = new ArrayList<Point>();

    /**
     * @param posX Destination X
     * @param posY Destination Y
     * @param piece Piece Knight
     */
    public void move(int posX, int posY, Piece piece) {
        possibleMoves(piece);
        if(isMoveValid(posX, posY)) {
            piece.setPosY(posY);
            piece.setPosX(posX);
        }
    }

    /**
     * Return a List of Points with all possible moves of Knight
     * @param piece the Knight piece
     * @return movePoints List of Points of moves
     */
    public List<Point> possibleMoves(Piece piece) {

        int[] xPossiblePos = {1, 1, -1, -1, 0, -1, 1, 0};
        int[] yPossiblePos = {1, -1, 1, -1, -1, 0, 0, 1};

        int xActPos = piece.getInitPosX();
        int yActPos = piece.getInitPosY();

        for(int i = 0; i < xPossiblePos.length ; i++) {
            int xPosition = xActPos + xPossiblePos[i];
            int yPosition = yActPos + yPossiblePos[i];
            if (0 <= xPosition && 0 <= yPosition &&xPosition < Chessboard.DIMENSION && yPosition < Chessboard.DIMENSION) {
                if(isPositionAvailable(Chessboard.board[xPosition][yPosition], piece.getColorWhite())) {
                    movePoints.add(new Point(xPosition, yPosition));
                }
            }
        }
        return movePoints;
    }
    /**
     * Verify if the destination selected for the player is valid
     * @param xDest
     * @param yDest
     * @return true if move is possible, false if move is no possible
     */
    private boolean isMoveValid(int xDest, int yDest) {
        for (Point availableMove: movePoints) {
            if (availableMove.getX() == xDest && availableMove.getY() == yDest)
                return true;
        }
        return false;
    }

    /**
     *  Verify if the space of destination is free from piece of the same color or is empty.
     * @param piece is the piece in the possible position.
     * @param colorMoving is the color of the King that is moving
     * @return true is space is empty or has a piece of different color, false if has piece of same color
     */
    public boolean isPositionAvailable(Piece piece, boolean colorMoving) {
        if(piece == null || piece.getColorWhite() != colorMoving)
            return true;
        return false;
    }

    @Override
    public ArrayList<String> getValidMoves(String position) {
        return null;
    }
}
