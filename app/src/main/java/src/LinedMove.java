package src;

import src.Pieces.Piece;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LinedMove implements MovePiece {
    List<Point> movePoints = new ArrayList<Point>();

    public void move(int posX, int posY, Piece piece) {
        if (isMoveValid(posX, posY)) {
            piece.setPosY(posY);
            piece.setPosX(posX);
            movePoints = new ArrayList<Point>();
        }
    }

    public void possibleMoves(Piece[][] board, Piece piece) {
        boolean oppositeColor = !piece.getColorWhite();
        //Down
        int posY = piece.getInitPosY();
        int posX = piece.getInitPosX();
        for (int i = posX + 1; i < board.length; i++) {
            if (board[i][posY] == null) {
                movePoints.add(new Point(i, posY));
            }
            if (board[i][posY].getColorWhite() != oppositeColor) {
                movePoints.add(new Point(i, posY));
                break;
            }
            if (board[i][posY].getColorWhite() == piece.getColorWhite()) {
                break;
            }
        }
        //Up
        for (int i = 0; i < posX; i++) {
            if (board[i][posY] == null) {
                movePoints.add(new Point(i, posY));
            }
            if (board[i][posY].getColorWhite() != oppositeColor) {
                movePoints.add(new Point(i, posY));
                break;
            }
            if (board[i][posY].getColorWhite() == piece.getColorWhite()) {
                break;
            }
        }
        //right
        for (int i = posY + 1; i < board.length; i++) {
            if (board[posX][i] == null) {
                movePoints.add(new Point(posX, i));
            }
            if (board[posX][i].getColorWhite() != oppositeColor) {
                movePoints.add(new Point(posX, i));
                break;
            }
            if (board[posX][i].getColorWhite() == piece.getColorWhite()) {
                break;
            }
        }
        //Left
        for (int i = 0; i < posY; i++) {
            if (board[posX][i] == null) {
                movePoints.add(new Point(posX, i));
            }
            if (board[posX][i].getColorWhite() != oppositeColor) {
                movePoints.add(new Point(posX, i));
                break;
            }
            if (board[posX][i].getColorWhite() == piece.getColorWhite()) {
                break;
            }
        }
    }

    public boolean isMoveValid(int xDest, int yDest) {
        for (Point availableMove : movePoints) {
            if (availableMove.getX() == xDest && availableMove.getY() == yDest)
                return true;
        }
        return false;
    }

    /**
     * Verify if the space of destination is free from piece of the same color
     *
     * @param xPosition
     * @param yPosition
     * @param isWhite
     * @return
     */
    public boolean isSpaceEmpty(int xPosition, int yPosition, boolean isWhite) {
        return true;
    }

    public ArrayList<Position> getValidMoves(Position position) {
        return  null;
    }
}
