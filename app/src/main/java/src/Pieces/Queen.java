package src.Pieces;

import src.DiagonalsMove;
import src.LinedMove;
import src.Position;

public class Queen extends Piece{
    private char figure = 'Q';
    public Queen(boolean white, Position position) {
        super(white, position);
        addMoveType(new DiagonalsMove());
        addMoveType(new LinedMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
