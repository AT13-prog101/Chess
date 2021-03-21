package src;

import src.Pieces.Piece;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DiagonalsMove implements MovePiece {
    List<Position> movePoints = new ArrayList<Position>();

    @Override
    public List<Position> getPossibleMoves(Piece piece) {
        int posX = piece.getInitPosX();
        int posY = piece.getInitPosY();
        int numberMax = Math.max(posX, posY);
        int numberMin = Math.min(posX, posY);
        //southeast (SE)
        for (int i = 1; numberMax + i < Chessboard.DIMENSION; i++) {
            if (!isAccessiblePosition(posX + i, posY + i, piece.getColorWhite())) {
                break;
            }
        }
        //northwest (NW).
        for (int i = 1; numberMin - i >= 0; i++) {
            if (!isAccessiblePosition(posX - i, posY - i, piece.getColorWhite())) {
                break;
            }
        }
        //southwest (SW)
        for (int i = 1; posX + i < Chessboard.DIMENSION && posY - i >= 0; i++) {
            if (!isAccessiblePosition(posX + i, posY - i, piece.getColorWhite())) {
                break;
            }
        }
        //northeast (NE)
        for (int i = 1; posY + i < Chessboard.DIMENSION && posX - i >= 0; i++) {
            if (!isAccessiblePosition(posX - i, posY + i, piece.getColorWhite())) {
                break;
            }
        }
        return movePoints;
    }

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

    public ArrayList<Position> getValidMoves(Position position) {
        return null;
    }
}
