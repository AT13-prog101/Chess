package src.Pieces;

import src.KnightMove;
import src.Position;

public class Horse extends Piece{
    private char figure = 'H';
    public Horse(boolean white, Position position) {
        super(white, position);
        addMoveType(new KnightMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
