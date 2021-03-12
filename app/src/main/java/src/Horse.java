package src;

public class Horse extends Piece{
    private char figure = 'H';
<<<<<<< HEAD

    public Horse(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
=======
    public Horse(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
    }
    public char getFigure() {
        return this.figure;
    }
>>>>>>> 656723b (fill chessboard with pieces and draw chessboard)
}
