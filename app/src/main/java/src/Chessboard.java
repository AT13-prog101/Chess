package src;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Chessboard {
    public final static int DIMENSION = 8;
    private Piece[][] board;
    private Team whiteTeam;
    private Team blackTeam;
    private Player player1;
    private Player player2;
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
    public void gameInit() {
        printBoard();
    }
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
                    String figure = String.valueOf(piece.getFigure()) + " ";
                    System.out.print(figure);
                }
            }
            System.out.println("");
        }
        System.out.println("   ----------------");
        System.out.println("    a b c d e f g h");
    }

    public void translatePosToMatrix() {

    }

    public void movePiece() {

    }
}
