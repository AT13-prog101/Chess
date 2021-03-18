package src;

import java.util.ArrayList;

public interface MovePiece {
    void move(int posX,int posY, boolean isWhite);
    public ArrayList<String> getValidMoves(String position);
}
