package src.Pieces;

public class Pawn extends Piece{
    private char figure = 'P';
    public Pawn(char color, int initPosX, int initPosY) {
        super(color, initPosX, initPosY);
        if (color == 'W') {
            addMoveType(new WhitePawnMove());
        } else {
            addMoveType(new BlackPawnMove());
        }
    }
    public char getFigure() {
        return this.figure;
    }
}
