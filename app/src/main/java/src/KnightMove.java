package src;

import src.Pieces.Piece;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class KnightMove implements MovePiece {
    private List<Position> movePoints = new ArrayList<Position>();

    /**
     * @param posX  Destination X
     * @param posY  Destination Y
     * @param piece Piece Knight
     */
    public void move(int posX, int posY, Piece piece) {
        //possibleMoves(piece);
        if (isMoveValid(posX, posY)) {
            piece.setPosY(posY);
            piece.setPosX(posX);
        }
    }

    /**
     * Return a List of Points with all possible moves of Knight
     *
     * @param colorPiece the Knight piece
     * @return movePoints List of Points of moves
     */
    public List<Position> getValidMoves(Position position, boolean colorPiece) {

        int[] xPossiblePos = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yPossiblePos = {1, 2, 2, 1, -1, -2, -2, -1};

        int xActPos = position.getPosX();
        int yActPos = position.getPosX();

        for (int i = 0; i < xPossiblePos.length; i++) {
            int xPosition = xActPos + xPossiblePos[i];
            int yPosition = yActPos + yPossiblePos[i];
            if (0 < xPosition && 0 < yPosition && xPosition < Chessboard.DIMENSION && yPosition < Chessboard.DIMENSION) {
                if (isSpaceEmpty(Chessboard.board[xPosition][yPosition], colorPiece)) {
                    movePoints.add(new Position(xPosition, yPosition));
                }
            }
        }
        return movePoints;
    }

    /**
     * Verify if the destination selected for the player is valid
     *
     * @param xDest
     * @param yDest
     * @return true if move is possible, false if move is no possible
     */
    private boolean isMoveValid(int xDest, int yDest) {
        for (Position availableMove : movePoints) {
            if (availableMove.getPosX() == xDest && availableMove.getPosY() == yDest)
                return true;
        }
        return false;
    }

    /**
     * Verify if the space of destination is free from piece of the same color or is empty.
     *
     * @param piece   is the piece in the possible position.
     * @param isWhite is the color of the Knight that is moving
     * @return true is space is empty or has a piece of different color, false if has piece of same color
     */
    public boolean isSpaceEmpty(Piece piece, boolean isWhite) {
        if (piece == null || piece.getColorWhite() != isWhite)
            return true;
        return false;
    }

    public boolean isSpaceWithEnemy(Piece piece, boolean isWhite) {
        if (piece.getColorWhite() == isWhite)
            return true;
        return false;
    }

    public void setPieceCaptured(Piece piece) {
        piece.setCaptured(true);
    }
}