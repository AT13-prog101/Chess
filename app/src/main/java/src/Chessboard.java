package src;

import src.Pieces.Piece;

public class Chessboard {
    public final static int DIMENSION = 8;
    private static Piece[][] board = new Piece[DIMENSION][DIMENSION];;
    private Team whiteTeam;
    private Team blackTeam;
    boolean turn;
    public Chessboard() {
        initializeChessboard();
    }
    public void initializeChessboard() {
        whiteTeam = new WhiteTeam();
        whiteTeam.initializeTeam();
        blackTeam = new BlackTeam();
        blackTeam.initializeTeam();
    }
    /**
     * Prints the board in console
     */
    public void printBoard() {
        for (int row = 0; row < DIMENSION; row++) {
            System.out.print(DIMENSION - row + " | ");
            for (int col = 0; col < DIMENSION; col++) {
                Piece piece;
                if (whiteTeam.thereIsPiece(col, row)) {
                    piece = whiteTeam.getPiece(col, row);
                } else {
                    piece = blackTeam.getPiece(col,row);
                }
                if (piece != null) {
                    String figure = String.valueOf(piece.getColor()) + String.valueOf(piece.getFigure()) + " ";
                    System.out.print(figure);
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
    public void movePiece(String[] moveToMake, Player player) {

    }
}
