package src;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PawnMove implements MovePiece{
    List<Point> movePoints = new ArrayList<Point>();

    @Override
    public void move(int posX, int posY, boolean isWhite) {

    }

    public void moved(int posX, int posY, Piece piece) {
        if(isMoveValid(posX, posY)) {
            piece.setPosY(posY);
            piece.setPosX(posX);
            piece.setIsMoved(true);
            movePoints = new ArrayList<Point>();
            if(piece.getInitPosY() == 0 || piece.getInitPosY() < 8)
                promotePawn();
        }
    }

    public void move(int posX, int posY, Piece piece) {

    }

    public void possibleMoves(int[][] chessBoard, Piece piece) {
        int oneMove = 1;
        int doubleMove = 2;
        if(piece.getColorWhite()) {
            oneMove = -1;
            doubleMove = -2;
        }
        if(!piece.isMoved()) {
            if(isSpaceEmpty(piece.getInitPosX(), piece.getInitPosY() + doubleMove, piece.getColorWhite()))
                movePoints.add(new Point(piece.getInitPosX(), piece.getInitPosY() + doubleMove));
        }
        if(0 <= (piece.getInitPosY() + oneMove) && (piece.getInitPosY() + oneMove) < chessBoard.length)
            movePoints.add(new Point(piece.getInitPosX(), piece.getInitPosY() + oneMove));
    }

    public boolean isMoveValid(int xDest, int yDest) {
        for (Point availableMove: movePoints) {
            if (availableMove.getX() == xDest && availableMove.getY() == yDest)
                return true;
        }
        return false;
    }

    public void promotePawn() {

    }

    public boolean isSpaceEmpty(int xPosition, int yPosition, boolean isWhite) {
        return true;
    }

}