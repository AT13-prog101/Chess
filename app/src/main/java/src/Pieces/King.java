package src.Pieces;

import src.KingMove;
import src.Position;

public class King extends Piece {
    private char figure = 'K';
    private boolean alive=true;
    public King(boolean white, Position position) {
        super(white, position);
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
