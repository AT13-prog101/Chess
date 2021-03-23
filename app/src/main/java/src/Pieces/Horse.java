package src.Pieces;

import src.KnightMove;

public class Horse extends Piece{
    private char figure = 'H';
    public Horse(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        addMoveType(new KnightMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
