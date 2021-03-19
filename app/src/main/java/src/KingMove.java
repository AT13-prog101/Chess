package src;

import src.Pieces.Piece;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class KingMove implements MovePiece{
    private List<Point> movePoints = new ArrayList<Point>();

    /**
     * @param posX Destination X
     * @param posY Destination Y
     * @param piece Piece Knight
     */
    public void move(int posX, int posY, Piece piece) {
        possibleMoves(piece);
            piece.setPosY(posY);
            piece.setPosX(posX);

    }

    /**
     * Return a List of Points with all possible moves of Knight
     * @param piece the Knight piece
     * @return movePoints List of Points of moves
     */
    public List<Point> possibleMoves(Piece piece) {

        int[] xPossiblePos = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yPossiblePos = {1, 2, 2, 1, -1, -2, -2, -1};

        int xActPos = piece.getInitPosX();
        int yActPos = piece.getInitPosY();

        for(int i = 0; i < xPossiblePos.length ; i++) {
            int xPosition = xActPos + xPossiblePos[i];
            int yPosition = yActPos + yPossiblePos[i];
            if (0 < xPosition && 0 < yPosition &&xPosition < Chessboard.DIMENSION && yPosition < Chessboard.DIMENSION) {
                    movePoints.add(new Point(xPosition, yPosition));
            }
        }
        return movePoints;
    }

    @Override
    public ArrayList<String> getValidMoves(String position) {
        return null;
    }
}
