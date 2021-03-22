package src;
import src.Pieces.Piece;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DiagonalsMove implements MovePiece {
    List<Position> movePositions = new ArrayList<>();

    @Override
    public List<Position> getPossibleMoves(Piece piece) {
        int xPos = piece.getInitPosX();
        int yPos = piece.getInitPosY();
        int numberMax = Math.max(xPos, yPos);
        int numberMin = Math.min(xPos, yPos);
        //southeast (SE)
        for (int i = 1; numberMax + i < Chessboard.DIMENSION; i++) {
            if(isSpaceEmpty(Chessboard.board[yPos+i][xPos+i])) {
                movePositions.add(new Position(xPos+i, yPos+i));
            }else if(isSpaceWithEnemy(Chessboard.board[yPos+i][xPos+i], piece.getColorWhite())) {
                movePositions.add(new Position(xPos+i, yPos+i));
                break;
            }else break;
        }
        //northwest (NW).
        for (int i = 1; numberMin - i >= 0; i++) {
            if(isSpaceEmpty(Chessboard.board[yPos-1][xPos-i])) {
                movePositions.add(new Position(xPos-i, yPos-1));
            }else if(isSpaceWithEnemy(Chessboard.board[yPos-1][xPos-i], piece.getColorWhite())) {
                movePositions.add(new Position(xPos-i, yPos-1));
                break;
            }else break;
        }
        //southwest (SW)
        for (int i = 1; xPos + i < Chessboard.DIMENSION && yPos - i >= 0; i++) {
            if(isSpaceEmpty(Chessboard.board[yPos-i][xPos+i])) {
                movePositions.add(new Position(xPos+i, yPos-i));
            }else if(isSpaceWithEnemy(Chessboard.board[yPos-i][xPos+i], piece.getColorWhite())) {
                movePositions.add(new Position(xPos+i, yPos-i));
                break;
            }else break;
        }
        //northeast (NE)
        for (int i = 1; yPos + i < Chessboard.DIMENSION && xPos - i >= 0; i++) {
            if(isSpaceEmpty(Chessboard.board[yPos+i][xPos-i])) {
                movePositions.add(new Position(xPos-i, yPos+i));
            }else if(isSpaceWithEnemy(Chessboard.board[yPos+i][xPos-i], piece.getColorWhite())) {
                movePositions.add(new Position(xPos-i, yPos+i));
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
}
