package src.PiecesMoves;

import src.Pieces.Piece;
import src.Utilities.Position;

import java.util.List;

public interface MovePiece {
    List<Position> getPossibleMoves(Piece piece);
    boolean isInLimits(int position);
    boolean isSpaceWithEnemy(Piece piece, boolean isWhite);
    boolean isSpaceEmpty(Piece piece);
}
