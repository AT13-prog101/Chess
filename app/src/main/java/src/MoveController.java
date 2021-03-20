package src;

import src.Pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class MoveController {

    private Position source;
    private Position target;
    private Player player1;
    private Player player2;
    private List<Position> validMoves = new ArrayList<Position>();
    /**
     * Given the 2nd input, moves the piece to the target position.
     */
    public void makeAMove(Position target, Player player) {
        this.target = target;
        Piece toMove = Chessboard.board[target.getPosY()][target.getPosX()];
            for (int i = 0; i < validMoves.size(); i++) {
                Position pos = validMoves.get(i);
                if (target.getPosY() == pos.getPosY() && pos.getPosX() == pos.getPosX()) {
                    Piece piece = Chessboard.board[source.getPosY()][source.getPosX()];
                    Chessboard.board[target.getPosY()][target.getPosX()] = piece;
                    Chessboard.board[source.getPosY()][source.getPosX()] = null;
                }
            }
    }

    /**
     * Returns all the valid moves a piece from the given source position can make
     */
    public List<Position> getValidMoves(Position source, Player player) {
        this.source = source;
        this.player1 = player;
        Piece piece = Chessboard.board[source.getPosY()][source.getPosX()];
        validMoves = piece.getValidMoves(source);
        return validMoves;
    }
}
