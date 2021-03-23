package src;

import src.Pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class Chessboard {
    public final static int DIMENSION = 8;
    public static Piece[][] board = new Piece[DIMENSION][DIMENSION];;
    private Team whiteTeam;
    private Team blackTeam;
    private Player winner;
    boolean turn;

    /**
     * Chessboard initializes the pieces from its Team instances
     */
    public Chessboard() {
        initializeChessboard();
    }
    public void initializeChessboard() {
        boolean isWhite = true;
        whiteTeam = new Team(isWhite);
        blackTeam = new Team(!isWhite);
    }
    /**
     * Prints the board in console
     */
    public void printBoard() {
        for (int row = 0; row < DIMENSION; row++) {
            System.out.print(DIMENSION - row + " | ");
            for (int col = 0; col < DIMENSION; col++) {
                if (board[row][col] != null) {
                    Piece piece = board[row][col];
                    String figure = String.valueOf(piece.getColor()) + String.valueOf(piece.getFigure()) + " ";
                    System.out.print(figure);
                } else {
                    System.out.print("  " + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("   -----------------------");
        System.out.println("    a  b  c  d  e  f  g  h\n");
    }
    public boolean movePiece(Position source, Position target, Player player) {
        List<Position> validMoves = getValidMoves(source, player);
        for (int i = 0; i < validMoves.size(); i++) {
            Position pos = validMoves.get(i);
            if (target.getPosY() == pos.getPosY() && target.getPosX() == pos.getPosX()) {
                Piece pieceToMove = Chessboard.board[source.getPosY()][source.getPosX()];
                if (Chessboard.board[target.getPosY()][target.getPosX()] != null) {
                    if (Chessboard.board[target.getPosY()][target.getPosX()].getFigure() == 'K') {
                        winner = player;
                    }
                }
                pieceToMove.updatePosition(target.getPosX(), target.getPosY());
                Chessboard.board[target.getPosY()][target.getPosX()] = pieceToMove;
                Chessboard.board[source.getPosY()][source.getPosX()] = null;
                return true;
            }
        }
        return false;
    }
    public Player kingTakenBy() {
        return winner;
    }
    /**
     * Returns all the valid moves a piece from the given source position can make
     */
    public List<Position> getValidMoves(Position source, Player player) {
        List<Position> validMoves = new ArrayList<Position>();
        Piece piece = board[source.getPosY()][source.getPosX()];
        if (player.isWhite == piece.getColorWhite()) {
            validMoves = piece.getValidMoves();
            return validMoves;
        }
        else {
            validMoves = null;
            return validMoves;
        }
    }

    /**
     * Prints on console the valid moves a piece can make
     */
    public void printValidMoves(List<Position> validMoves) {
        for (Position pos : validMoves) {
            System.out.println(pos.getCharAlg() + " ");
        }
    }
    public boolean thereIsPiece (Position position) {
        if (board[position.getPosY()][position.getPosX()] == null)
            return false;
        return true;
    }
    /**
     * Checks if a king has been taken.
     */
    public boolean isCheckmate () {
        return false;
    }
}
