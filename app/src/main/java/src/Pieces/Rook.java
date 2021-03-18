package src.Pieces;

public class Rook extends Piece{
    private char figure = 'R';
    public Rook(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}