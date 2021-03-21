package src;

import src.Pieces.Piece;
import java.util.ArrayList;
import java.util.List;

public interface MovePiece {
    void move(int posX, int posY, Piece piece);
    public List<Position> getValidMoves(Position position, boolean colorPiece);
}
