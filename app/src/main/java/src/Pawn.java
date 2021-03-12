package src;

public class Pawn extends Piece{
    private char figure = 'P';
    public Pawn(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}
