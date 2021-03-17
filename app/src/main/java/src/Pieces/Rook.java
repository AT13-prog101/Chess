package src.Pieces;

public class Rook extends Piece{
    private char figure = 'R';
    public Rook(char color, int initPosX, int initPosY) {
        super(color, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}
