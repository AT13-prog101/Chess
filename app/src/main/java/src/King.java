package src;

<<<<<<< HEAD
public class King extends Piece{
    private char figure = 'K';

    public King(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
=======
public class King extends Piece {
    private char figure = 'K';
    public King(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
>>>>>>> 656723b (fill chessboard with pieces and draw chessboard)
}
