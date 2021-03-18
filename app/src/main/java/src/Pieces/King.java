package src;

public class King extends Piece {
    private char figure = 'K';
    public King(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}
