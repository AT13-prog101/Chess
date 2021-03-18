package src.Pieces;

public class Bishop extends Piece{
    private char figure = 'B';
    public Bishop(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        
    }
    public char getFigure() {
        return this.figure;
    }
}
