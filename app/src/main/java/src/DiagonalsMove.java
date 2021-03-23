package src;
import src.Pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class DiagonalsMove implements MovePiece {
    List<Position> movePoints;

    @Override
    public List<Position> getPossibleMoves(Piece piece) {
        movePoints = new ArrayList<Position>();
        int posX = piece.getPosX();
        int posY = piece.getPosY();
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
    public boolean isAccessiblePosition(int posY, int posX, boolean colorPiece) {
        boolean oppositeColor = !colorPiece;

        if (Chessboard.board[posX][posY].getPiece() == null) {
            movePoints.add(new Position(posY, posX));
            return true;
        } else {
            if (Chessboard.board[posX][posY].getPiece().getColorWhite() != colorPiece) {
                movePoints.add(new Position(posY, posX));
                return false;
            } else {
                if (Chessboard.board[posX][posY].getPiece().getColorWhite() == colorPiece) {
                    return false;
                }
            }
        }
        return false;
    }
    @Override
    public boolean isInLimits(int position) {
        return false;
    }

    @Override
    public boolean isSpaceWithEnemy(Piece piece, boolean isWhite) {
        return false;
    }

    @Override
    public boolean isSpaceEmpty(Piece piece) {
        return false;
    }
}

