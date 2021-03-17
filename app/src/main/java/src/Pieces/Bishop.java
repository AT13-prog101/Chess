package src.Pieces;

public class Bishop extends Piece{
    private char figure = 'B';
    public Bishop(char color, int initPosX, int initPosY) {
        super(color, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}
