package src.Pieces;

import src.PawnMove;
import src.Position;

public class Pawn extends Piece{
    private char figure = 'P';
    public Pawn(boolean white, Position position) {
        super(white, position);

        addMoveType(new PawnMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
