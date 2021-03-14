package src;

import java.util.List;
import java.util.ArrayList;

public abstract class Team {
    List<Piece> setOfPieces = new ArrayList<Piece>();
    public Team() {
    }
    public boolean thereIsPiece(int posX, int posY) {
        for (Piece piece : setOfPieces) {
            if (piece.getInitPosX() == posX && piece.getInitPosY() == posY) {
                return true;
            }
        }
        return false;
    }
    public Piece getPiece(int posX, int posY){
        for (Piece piece : setOfPieces) {
            if (piece.getInitPosX() == posX && piece.getInitPosY() == posY) {
                return piece;
            }
        }
        return null;
    }
    abstract void initializeTeam();
}
