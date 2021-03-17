package src.Pieces;

public class King extends Piece {
    private char figure = 'K';
    public King(char color, int initPosX, int initPosY) {
        super(color, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}
