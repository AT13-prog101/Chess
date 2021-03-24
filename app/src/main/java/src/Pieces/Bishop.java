package src.Pieces;

import src.PieceMovements.DiagonalsMove;
import src.Position;

public class Bishop extends Piece{
    private char figure = 'B';
    public Bishop(boolean white, Position position) {
        super(white, position);
        addMoveType(new DiagonalsMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
