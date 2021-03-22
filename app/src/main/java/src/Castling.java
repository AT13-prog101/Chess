package src;

import src.Pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class Castling implements MovePiece{

    @Override
    public List<Position> getPossibleMoves(Piece piece) {
        List<Position> movePositions = new ArrayList<>();
        int xPosQ = 0;
        int xPosK = Chessboard.DIMENSION;

        if(piece.getColorWhite()) {

        }
        if(!piece.isMoved()) {
            //Castling King
            int checkEmpty = 0;
            if(!isHaveMoved(Chessboard.board[piece.getInitPosY()][xPosK])) {
                for(int i = 1; i <= 2; i++) {
                    if(!isSpaceEmpty(Chessboard.board[piece.getInitPosY()][xPosK - i])) {
                        break;
                    }
                    checkEmpty++;
                }
                if(checkEmpty == 2)
                    movePositions.add(new Position(xPosK - 1, piece.getInitPosY()));
            }

            //Castling Queen
            if(!isHaveMoved(Chessboard.board[piece.getInitPosY()][xPosQ])) {
                checkEmpty = 0;
                for(int i = 1; i <= 3; i++) {
                    if(!isSpaceEmpty(Chessboard.board[piece.getInitPosY()][xPosQ + i])) {
                        break;
                    }
                    checkEmpty++;
                }
                if(checkEmpty == 3)
                    movePositions.add(new Position(xPosQ + 2, piece.getInitPosY()));
            }
        }
        return movePositions;
    }

    /**
     *  Verify if the space of destination is free from piece of the same color or is empty.
     * @param piece is the piece in the possible position.
     * @return true is space is empty or has a piece of different color, false if has piece of same color
     */
    @Override
    public boolean isSpaceEmpty(Piece piece) {
        if(piece == null)
            return true;
        return false;
    }

    /**
     *  Verify if Destiny position has an enemy
     * @param piece
     * @param isWhite
     * @return
     */
    @Override
    public boolean isSpaceWithEnemy(Piece piece, boolean isWhite) {
        if(piece.getColorWhite() != isWhite)
            return true;
        else
            return false;
    }

    /**
     *  Verify is the Position is inside the Limits of the Chessboard
     * @param position
     * @return true if its in the limits, false if not
     */
    @Override
    public boolean isInLimits(int position) {
        if(0 <= position && position < Chessboard.DIMENSION) {
            return true;
        }
        return false;
    }

    /**
     *  Verify if the piece Rook has moved previously
     * @param piece Rook
     * @return true if has moved, false if not.
     */
    public boolean isHaveMoved(Piece piece) {
        return piece.getColorWhite();
    }
}