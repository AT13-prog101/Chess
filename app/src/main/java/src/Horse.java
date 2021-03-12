package src;

public class Horse extends Piece{
    private char figure = 'H';
    public Horse(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
}
