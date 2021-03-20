package src;
import src.Pieces.Piece;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DiagonalsMove implements MovePiece {
    List<Point> movePoints = new ArrayList<Point>();

    public void move(int posX, int posY, Piece piece) {
        if (isMoveValid(posX, posY)) {
            piece.setPosY(posY);
            piece.setPosX(posX);
            movePoints = new ArrayList<Point>();
        }
    }

    public void possibleMoves(Piece[][] board, Piece piece) {
        int posX = piece.getInitPosX();
        int posY = piece.getInitPosY();
        int numerMax = Math.max(posX, posY);
        int numerMin = Math.min(posX, posY);
        boolean oppositeColor = !piece.getColorWhite();
        //southeast (SE)
        for (int i = 1; numerMax + i < board.length; i++) {
            if (board[posX + i][posY + i] == null) {
                movePoints.add(new Point(posX + i, posY + i));
            }
            if (board[posX + i][posY + i].getColorWhite() != oppositeColor) {
                movePoints.add(new Point(posX + i, posY + i));
                break;
            }
            if (board[posX + i][posY + i].getColorWhite() == piece.getColorWhite()) {
                break;
            }
        }
        //northwest (NW).
        for (int i = 1; numerMin - i >= 0; i++) {
            if (board[posX - i][posY - i] == null) {
                movePoints.add(new Point(posX - i, posY - i));
            }
            if (board[posX - i][posY - i].getColorWhite() != oppositeColor) {
                movePoints.add(new Point(posX - i, posY - i));
                break;
            }
            if (board[posX - i][posY - i].getColorWhite() == piece.getColorWhite()) {
                break;
            }
        }
        //southwest (SW)
        for (int i = 1; posX + i < board.length && posY - i >= 0; i++) {
            if (board[posX + i][posY - i] == null) {
                movePoints.add(new Point(posX + i, posY - i));
            }
            if (board[posX + i][posY - i].getColorWhite() != oppositeColor) {
                movePoints.add(new Point(posX + i, posY - i));
                break;
            }
            if (board[posX + i][i].getColorWhite() == piece.getColorWhite()) {
                break;
            }
        }
        //northeast (NE)
        for (int i = 1; posY + i < board.length && posX - i >= 0; i++) {
            if (board[posX - i][posY + i] == null) {
                movePoints.add(new Point(posX - i, posY + i));
            }
            if (board[posX - i][posY + i].getColorWhite() != oppositeColor) {
                movePoints.add(new Point(posX - i, posY + i));
                break;
            }
            if (board[posX - i][posY + i].getColorWhite() == piece.getColorWhite()) {
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
