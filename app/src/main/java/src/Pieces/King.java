package src.Pieces;

<<<<<<< HEAD
import src.PiecesMoves.KingMove;
=======
import src.KingMove;
import src.Position;
>>>>>>> dev

public class King extends Piece {
    private char figure = 'K';
    private final String BLACK_KING_DIR = "src/main/resources/BlackKing.png";
    private final String WHITE_KING_DIR = "src/main/resources/WhiteKing.png";
    private boolean alive=true;
<<<<<<< HEAD
    public King(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        if (white == true) {
            setImage(WHITE_KING_DIR);
        } else {
            setImage(BLACK_KING_DIR);
        }
=======
    public King(boolean white, Position position) {
        super(white, position);
>>>>>>> dev
        addMoveType(new KingMove());
    }

    /**
     *
     * @return life of king
     */
    public boolean getLive(){return alive;}

    /** Change status life of king
     *
     * @return void
     */
    public void setLive(boolean changeStatusLife){ this.alive=changeStatusLife;}

    /** Return figure of king
     *
     * @return char that is figure of king
     */
    public char getFigure() {
        return this.figure;
    }
}
