package src;

import src.Pieces.Piece;
import java.util.ArrayList;
import java.util.List;

public interface MovePiece {
    List<Position> getPossibleMoves(Piece piece);
}
