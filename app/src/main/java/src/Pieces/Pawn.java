package src.Pieces;

public class Pawn extends Piece{
    private char figure = 'P';
    public Pawn(boolean white, int initPosX, int initPosY) {
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
