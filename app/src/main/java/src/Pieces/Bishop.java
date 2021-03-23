package src.Pieces;

import src.DiagonalsMove;

public class Bishop extends Piece{
    private char figure = 'B';
    public Bishop(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        addMoveType(new DiagonalsMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
