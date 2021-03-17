package src.Pieces;

public class Queen extends Piece{
    private char figure = 'Q';
    public Queen(char color, int initPosX, int initPosY) {
        super(color, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}
