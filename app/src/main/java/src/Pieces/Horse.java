package src.Pieces;

public class Horse extends Piece{
    private char figure = 'H';
    public Horse(char color, int initPosX, int initPosY) {
        super(color, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}
