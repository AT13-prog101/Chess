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
            if (!isAccessiblePosition(i,posY,piece.getColorWhite())){
                break;
            }
        }
        //Up
        for (int i = 0; i < posX; i++) {
            if (!isAccessiblePosition(i,posY,piece.getColorWhite())){
                break;
            }
        }
        //right
        for (int i = posY + 1; i < board.length; i++) {
            if (!isAccessiblePosition(posX , i,piece.getColorWhite())){
                break;
            }
        }
        //Left
        for (int i = 0; i < posY; i++) {
            if (!isAccessiblePosition(posX , i,piece.getColorWhite())){
                break;
            }
        }
    }

    /**
     * Verify if the destination selected for the player is valid
     * @param xDest
     * @param yDest
     * @return true if move is possible, false if move is no possible
     */
    public boolean isMoveValid(int xDest, int yDest) {
        for (Point availableMove : movePoints) {
            if (availableMove.getX() == xDest && availableMove.getY() == yDest)
                return true;
        }
        return false;
    }

    /**
     * Verify if the space of destination is free from piece of the same color
     * @param posX is a position analise of Chessboard
     * @param posY is a position analise of Chessboard
     * @return boolean which say is accessible Position
     */
    public boolean isAccessiblePosition(int posX, int posY, boolean colorPiece) {
        boolean oppositeColor = !colorPiece;

        if (Chessboard.board[posX][posY] == null) {
            movePoints.add(new Point(posX , posY));
            return true;
        }
        if (Chessboard.board[posX][posY].getColorWhite() != oppositeColor) {
            movePoints.add(new Point(posX , posY ));
            return false;
        }
        if (Chessboard.board[posX ][posY].getColorWhite() == colorPiece) {
            return false;
        }
        return false;
    }

    public ArrayList<Position> getValidMoves(Position position) {
        return  null;
    }
}
