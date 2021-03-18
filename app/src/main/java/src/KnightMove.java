package src;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class KnightMove implements MovePiece{
    List<Point> movePoints = new ArrayList<Point>();

    @Override
    public void move(int posX, int posY, boolean isWhite) {

    }

    public void moved(int posX, int posY, Piece piece) {
        if(isMoveValid(posX, posY)) {
            piece.setPosY(posY);
            piece.setPosX(posX);
            movePoints = new ArrayList<Point>();
        }
    }

    public void possibleMoves(int[][] chessBoard, Piece piece) {

        int[] xPossiblePos = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yPossiblePos = {1, 2, 2, 1, -1, -2, -2, -1};

        int xActPos = piece.getInitPosX();
        int yActPos = piece.getInitPosY();

        for(int i = 0; i < xPossiblePos.length ; i++) {
            int xPosition = xActPos + xPossiblePos[i];
            int yPosition = yActPos + yPossiblePos[i];
            if (0 < xPosition && 0 < yPosition &&xPosition < chessBoard.length && yPosition < chessBoard.length) {
                if(isSpaceEmpty(xPosition, yPosition, piece.getColorWhite())) {
                    movePoints.add(new Point(xPosition, yPosition));
                }
            }
        }
    }



    public boolean isMoveValid(int xDest, int yDest) {
        for (Point availableMove: movePoints) {
            if (availableMove.getX() == xDest && availableMove.getY() == yDest)
                return true;
        }
        return false;
    }

    /**
     *  Verify if the space of destination is free from piece of the same color
     * @param xPosition
     * @param yPosition
     * @param isWhite
     * @return
     */
    public boolean isSpaceEmpty(int xPosition, int yPosition, boolean isWhite) {
        return true;
    }
}