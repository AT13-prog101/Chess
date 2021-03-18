package src.Pieces;

public class Queen extends Piece{
    private char figure = 'Q';
    public Queen(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}
