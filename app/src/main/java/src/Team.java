package src;

import src.Pieces.Piece;

import java.util.List;
import java.util.ArrayList;

public abstract class Team {
    List<Piece> setOfPieces = new ArrayList<Piece>();

    /**
     * Class Team stores a set of pieces
     */
    public Team() {
    }
    public boolean thereIsPiece(String pos) {
        PositionTraductor positionTraductor = new PositionTraductor();
        int posX = positionTraductor.getXIndexNotation(pos);
        int posY = positionTraductor.getYIndexNotation(pos);
        for (Piece piece : setOfPieces) {
            if (piece.getInitPosX() == posX && piece.getInitPosY() == posY) {
                return true;
            }
        }
        return false;
    }
    public boolean thereIsPiece(int posX, int posY) {
        for (Piece piece : setOfPieces) {
            if (piece.getInitPosX() == posX && piece.getInitPosY() == posY) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the Piece that matches the given positions for x and y
     */
    public Piece getPiece(String pos){
        PositionTraductor positionTraductor = new PositionTraductor();
        int posX = positionTraductor.getXIndexNotation(pos);
        int posY = positionTraductor.getYIndexNotation(pos);
        for (Piece piece : setOfPieces) {
            if (piece.getInitPosX() == posX && piece.getInitPosY() == posY) {
                return piece;
            }
        }
        return null;
    }
    public Piece getPiece(int posX, int posY) {
        for (Piece piece : setOfPieces) {
            if (piece.getInitPosX() == posX && piece.getInitPosY() == posY) {
                return piece;
            }
        }
        return null;
    }

        /**
         * Fills the set of pieces of the team with Pieces
         */
    abstract void initializeTeam();
}
