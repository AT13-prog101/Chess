package src.Pieces;

public class Horse extends Piece{
    private char figure = 'H';
    public Horse(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        if (white == true) {
            setColor('W');
        } else
        {
            setColor('B');
        }
    }
    public char getFigure() {
        return this.figure;
    }
}
