package src;

import src.Pieces.Piece;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class MoveController {

    private Game game;
    private Position source;
    private Position target;
    private Player player;
    private List<Position> validMoves = new ArrayList<Position>();
    public MoveController(Game game) {
        this.game = game;
    }
    /**
     * Given the 2nd input, moves the piece to the target position.
     */
    public void validateAMove(Position target, Player player) {
        this.target = target;
        this.player = player;
                if(validMoves.contains(target)){
                    //System.out.println("XXX");
                    Piece pieceToMove = Chessboard.board[source.getPosY()][source.getPosX()];
                    if (Chessboard.board[target.getPosY()][target.getPosX()] != null) {
                        if (Chessboard.board[target.getPosY()][target.getPosX()].getFigure() == 'K') {
                            game.setGameFinished(true);
                        }
                    }
//                    pieceToMove.updatePosition(target.getPosX(), target.getPosY());
//                    Chessboard.board[target.getPosY()][target.getPosX()] = pieceToMove;
//                    Chessboard.board[source.getPosY()][source.getPosX()] = null;
                }
    }

    /**
     * Returns all the valid moves a piece from the given source position can make
     */
    public List<Position> getValidMoves(Position source, Player player) {
        this.source = source;
        this.player = player;
        Piece piece = Chessboard.board[source.getPosY()][source.getPosX()];
        if (player.isWhite == piece.getColorWhite()) {
            validMoves = piece.getValidMoves();
            return validMoves;
        }
        else {
            validMoves = null;
            return validMoves;
        }
    }
}
