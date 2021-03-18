package src.Pieces;

public class Rook extends Piece{
    private char figure = 'R';
    public Rook(boolean white, int initPosX, int initPosY) {
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
