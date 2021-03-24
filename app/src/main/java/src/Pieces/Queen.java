package src.Pieces;

<<<<<<< HEAD
import src.PiecesMoves.DiagonalsMove;
import src.PiecesMoves.LinedMove;

public class Queen extends Piece{
    private char figure = 'Q';
    private final String BLACK_QUEEN_DIR = "src/main/resources/BlackQueen.png";
    private final String WHITE_QUEEN_DIR = "src/main/resources/WhiteQueen.png";
    public Queen(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        if (white == true) {
            setImage(WHITE_QUEEN_DIR);
        } else {
            setImage(BLACK_QUEEN_DIR);
        }
=======
import src.DiagonalsMove;
import src.LinedMove;
import src.Position;

public class Queen extends Piece{
    private char figure = 'Q';
    public Queen(boolean white, Position position) {
        super(white, position);
>>>>>>> dev
        addMoveType(new DiagonalsMove());
        addMoveType(new LinedMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
