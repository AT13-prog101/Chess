package src.Pieces;

import src.PiecesMoves.LinedMove;
import src.Position;

public class Rook extends Piece{
    private char figure = 'R';
    public Rook(boolean white, Position position) {
        super(white, position);
        addMoveType(new LinedMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
