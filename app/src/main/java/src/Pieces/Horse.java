package src.Pieces;

<<<<<<< HEAD
import src.PiecesMoves.KnightMove;

public class Horse extends Piece{
    private char figure = 'H';
    private final String BLACK_KNIGHT_DIR = "src/main/resources/BlackKnight.png";
    private final String WHITE_KNIGHT_DIR = "src/main/resources/WhiteKnight.png";
    public Horse(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        if (white == true) {
            setImage(WHITE_KNIGHT_DIR);
        } else
        {
            setImage(BLACK_KNIGHT_DIR);
        }
=======
import src.KnightMove;
import src.Position;

public class Horse extends Piece{
    private char figure = 'H';
    public Horse(boolean white, Position position) {
        super(white, position);
>>>>>>> dev
        addMoveType(new KnightMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
