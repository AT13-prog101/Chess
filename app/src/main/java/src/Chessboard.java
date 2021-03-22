package src;

import src.Pieces.Piece;

import java.util.List;

public class Chessboard {
    public final static int DIMENSION = 8;
    public static Piece[][] board = new Piece[DIMENSION][DIMENSION];;
    private Team whiteTeam;
    private Team blackTeam;
    Position target;
    Position source;
    Player player;
    List<Position> validMoves;

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
        System.out.println("    a  b  c  d  e  f  g  h");
    }

    /**
     * Checks if a king has been taken.
     */
    public boolean isCheckmate () {
        return false;
    }
    /**
     *
     */
    void moveAPiece(Position source,Position target){
        Piece pieceToMove =Chessboard.board[source.getPosY()][source.getPosX()];
        pieceToMove.updatePosition(target.getPosX(), target.getPosY());
        Chessboard.board[target.getPosY()][target.getPosX()] = pieceToMove;
        Chessboard.board[source.getPosY()][source.getPosX()] = null;
    }
}
