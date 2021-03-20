package src.Pieces;

import src.PawnMove;

public class Pawn extends Piece{
    private char figure = 'P';
    public Pawn(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        if (white == true) {
            setColor('W');
        } else
        {
            setColor('B');
        }
        addMoveType(new PawnMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
