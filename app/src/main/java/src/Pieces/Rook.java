package src.Pieces;

import src.LinedMove;

public class Rook extends Piece{
    private char figure = 'R';
    public Rook(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        addMoveType(new LinedMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
