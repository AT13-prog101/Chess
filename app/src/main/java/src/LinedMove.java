package src;

import src.Pieces.Piece;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LinedMove implements MovePiece {
    List<Position> movePoints = new ArrayList<Position>();

    @Override
    public void move(int posX, int posY, Piece piece) {
        if (isMoveValid(posX, posY)) {
            piece.setPosY(posY);
            piece.setPosX(posX);
            movePoints = new ArrayList<Position>();
        }
    }

    @Override
    public List<Position> getValidMoves(Position position, boolean colorPiece) {
        boolean oppositeColor = !colorPiece;
        //Down
        int posY = position.getPosY();
        int posX = position.getPosX();
        for (int i = posX + 1; i < Chessboard.DIMENSION; i++) {
            if (!isAccessiblePosition(i, posY, colorPiece)) {
                break;
            }
        }
        //Up
        for (int i = 0; i < posX; i++) {
            if (!isAccessiblePosition(i, posY, colorPiece)) {
                break;
            }
        }
        //right
        for (int i = posY + 1; i < Chessboard.DIMENSION; i++) {
            if (!isAccessiblePosition(posX, i, colorPiece)) {
                break;
            }
        }
        //Left
        for (int i = 0; i < posY; i++) {
            if (!isAccessiblePosition(posX, i, colorPiece)) {
                break;
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
    public boolean isMoveValid(int xDest, int yDest) {
        for (Position availableMove : movePoints) {
            if (availableMove.getPosX() == xDest && availableMove.getPosY() == yDest)
                return true;
        }
        return false;
    }

    /**
     * Verify if the space of destination is free from piece of the same color
     *
     * @param posX is a position analise of Chessboard
     * @param posY is a position analise of Chessboard
     * @return boolean which say is accessible Position
     */
    public boolean isAccessiblePosition(int posX, int posY, boolean colorPiece) {
        boolean oppositeColor = !colorPiece;

        if (Chessboard.board[posX][posY] == null) {
            movePoints.add(new Position(posX, posY));
            return true;
        }
        if (Chessboard.board[posX][posY].getColorWhite() != oppositeColor) {
            movePoints.add(new Position(posX, posY));
            return false;
        }
        if (Chessboard.board[posX][posY].getColorWhite() == colorPiece) {
            return false;
        }
        return false;
    }
}
