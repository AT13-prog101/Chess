package src.Pieces;

<<<<<<< HEAD
import src.PiecesMoves.DiagonalsMove;

public class Bishop extends Piece{
    private char figure = 'B';
    private final String BLACK_BISHOP_DIR = "src/main/resources/BlackBishop.png";
    private final String WHITE_BISHOP_DIR = "src/main/resources/WhiteBishop.png";
    public Bishop(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        if (white == true) {
            setImage(WHITE_BISHOP_DIR);
        } else
        {
            setImage(BLACK_BISHOP_DIR);
        }
=======
import src.DiagonalsMove;
import src.Position;

public class Bishop extends Piece{
    private char figure = 'B';
    public Bishop(boolean white, Position position) {
        super(white, position);
>>>>>>> dev
        addMoveType(new DiagonalsMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
