package src.Pieces;

public class Pawn extends Piece{
    private char figure = 'P';
    public Pawn(char color, int initPosX, int initPosY) {
        super(color, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}
