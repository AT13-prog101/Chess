package src.PieceMovements;

import src.Chessboard;
import src.Pieces.Piece;
import src.Position;

import java.util.ArrayList;
import java.util.List;

public class LinedMove implements MovePiece {

    @Override
    public List<Position> getPossibleMoves(Piece piece) {
        List<Position> movePositions = new ArrayList<>();
        int xPos = piece.getPosX();
        int yPos = piece.getPosY();

        for(int i = xPos + 1; i < Chessboard.DIMENSION; i++) {
            if(isSpaceEmpty(Chessboard.board[yPos][i])) {
                movePositions.add(new Position(i, yPos));
            }else if(isSpaceWithEnemy(Chessboard.board[yPos][i], piece.getColorWhite())) {
                    movePositions.add(new Position(i, yPos));
                    break;
            }else break;
        }
        for( int i = xPos -1; i >= 0; i--) {
            if(isSpaceEmpty(Chessboard.board[yPos][i])) {
                movePositions.add(new Position(i, yPos));
            }else if(isSpaceWithEnemy(Chessboard.board[yPos][i], piece.getColorWhite())) {
                    movePositions.add(new Position(i, yPos));
                    break;
            }else break;
        }
        for( int i = yPos + 1; i < Chessboard.DIMENSION; i++) {
            if(isSpaceEmpty(Chessboard.board[i][xPos])) {
                movePositions.add(new Position(xPos, i));
            }else if(isSpaceWithEnemy(Chessboard.board[i][xPos], piece.getColorWhite())) {
                movePositions.add(new Position(xPos, i));
                break;
            }else break;
        }
        for( int i = yPos - 1; i >= 0; i--) {
            if(isSpaceEmpty(Chessboard.board[i][xPos])) {
                movePositions.add(new Position(xPos, i));
            }else if(isSpaceWithEnemy(Chessboard.board[i][xPos], piece.getColorWhite())) {
                movePositions.add(new Position(xPos, i));
                break;
            }else break;
        }
        return movePositions;
    }

    /**
     *  Verify if the space of destination is free from piece of the same color or is empty.
     * @param piece is the piece in the possible position.
     * @return true is space is empty or has a piece of different color, false if has piece of same color
     */
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
}
