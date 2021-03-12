package src;

public class Pawn extends Piece{
<<<<<<< HEAD
    private char figure = 'p';

    public Pawn(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
=======
    private char figure = 'P';
    public Pawn(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
>>>>>>> 656723b (fill chessboard with pieces and draw chessboard)
}
