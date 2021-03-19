package src;

import src.Pieces.Piece;
import java.util.ArrayList;

public interface MovePiece {
    void move(int posX, int posY, Piece piece);
    public ArrayList<String> getValidMoves(String position);
}
