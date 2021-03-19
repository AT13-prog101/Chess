package src;

import src.Pieces.Piece;

import java.util.List;

public class Chessboard {
    public final static int DIMENSION = 8;
    public static Piece[][] board = new Piece[DIMENSION][DIMENSION];;
    private Team whiteTeam;
    private Team blackTeam;
    boolean turn;
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

    public void translatePosToMatrix() {

    }
    public boolean isCheckmate () {
        return false;
    }
    public void movePiece(List<Position> moveToMake, Player player) {
        PositionTraductor positionTraductor = new PositionTraductor();
        Position source = moveToMake.get(0);
        Position target = moveToMake.get(1);

        if (Chessboard.board[source.getPosY()][source.getPosX()] != null) {
            Chessboard.board[target.getPosY()][target.getPosX()] = Chessboard.board[source.getPosY()][source.getPosX()];
            Chessboard.board[source.getPosY()][source.getPosX()] = null;
        }
        printBoard();
    }
}
