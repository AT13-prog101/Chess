package src.PiecesMoves;

import src.Pieces.Piece;
import src.Position;

import java.util.ArrayList;
import java.util.List;

public interface MoveType {
    List<Position> getPossibleMoves(Piece piece);
    boolean isInLimits(int position);
    boolean isSpaceWithEnemy(Piece piece, boolean isWhite);
    boolean isSpaceEmpty(Piece piece);
}
