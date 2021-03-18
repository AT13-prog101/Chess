package src.Pieces;

public class Queen extends Piece{
    private char figure = 'Q';
    public Queen(boolean white, int initPosX, int initPosY) {
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
