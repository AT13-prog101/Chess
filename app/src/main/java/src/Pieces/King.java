package src.Pieces;

public class King extends Piece {
    private char figure = 'K';
    public King(boolean white, int initPosX, int initPosY) {
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
