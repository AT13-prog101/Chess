package src.Pieces;

import src.DiagonalsMove;
import src.LinedMove;

public class Queen extends Piece{
    private char figure = 'Q';
    public Queen(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        addMoveType(new DiagonalsMove());
        addMoveType(new LinedMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
