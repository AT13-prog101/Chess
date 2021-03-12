package src;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Chessboard {
    public final int ASCI_CODE_A = 104;
    private final int DIMENSION = 8;
    public static Piece[][] board;
    private List<Piece> pieces;
    boolean turn;
    private Piece WRook1;
    private Piece WHorse1;
    private Piece WBishop1;
    private Piece WQueen;
    private Piece WKing;
    private Piece WBishop2;
    private Piece WHorse2;
    private Piece WRook2;
    private Piece WPeon1;
    private Piece WPeon2;
    private Piece WPeon3;
    private Piece WPeon4;
    private Piece WPeon5;
    private Piece WPeon6;
    private Piece WPeon7;
    private Piece WPeon8;

    private Piece BRook1;
    private Piece BHorse1;
    private Piece BBishop1;
    private Piece BQueen;
    private Piece BKing;
    private Piece BBishop2;
    private Piece BHorse2;
    private Piece BRook2;
    private Piece BPeon1;
    private Piece BPeon2;
    private Piece BPeon3;
    private Piece BPeon4;
    private Piece BPeon5;
    private Piece BPeon6;
    private Piece BPeon7;
    private Piece BPeon8;
    public Chessboard() {
        board = new Piece[DIMENSION][DIMENSION];
        pieces = new ArrayList<Piece>();
        WRook1 = new Rook(true, 0, 0); pieces.add(WRook1);
        WHorse1 = new Horse(true, 1, 0); pieces.add(WHorse1);
        WBishop1 = new Bishop(true, 2, 0); pieces.add(WBishop1);
        WQueen = new Queen(true, 3, 0); pieces.add(WQueen);
        WKing = new King(true, 4, 0); pieces.add(WKing);
        WBishop2 = new Bishop(true, 5, 0); pieces.add(WBishop2);
        WHorse2 = new Horse(true, 6, 0); pieces.add(WHorse2);
        WRook2 = new Rook(true, 7, 0); pieces.add(WRook2);
        WPeon1 = new Pawn(true, 0, 1); pieces.add(WPeon1);
        WPeon2 = new Pawn(true, 1, 1); pieces.add(WPeon2);
        WPeon3 = new Pawn(true, 2, 1); pieces.add(WPeon3);
        WPeon4 = new Pawn(true, 3, 1); pieces.add(WPeon4);
        WPeon5 = new Pawn(true, 4, 1); pieces.add(WPeon5);
        WPeon6 = new Pawn(true, 5, 1); pieces.add(WPeon6);
        WPeon7 = new Pawn(true, 6, 1); pieces.add(WPeon7);
        WPeon8 = new Pawn(true, 7, 1); pieces.add(WPeon8);

        BRook1 = new Rook(false, 0, 7); pieces.add(BRook1);
        BHorse1 = new Horse(false, 1, 7); pieces.add(BHorse1);
        BBishop1 = new Bishop(false, 2, 7); pieces.add(BBishop1);
        BQueen = new Queen(false, 3, 7); pieces.add(BQueen);
        BKing = new King(false, 4, 7); pieces.add(BKing);
        BBishop2 = new Bishop(false, 5, 7); pieces.add(BBishop2);
        BHorse2 = new Horse(false, 6, 7); pieces.add(BHorse2);
        BRook2 = new Rook(false, 7, 7); pieces.add(BRook2);
        BPeon1 = new Pawn(false, 0, 6); pieces.add(BPeon1);
        BPeon2 = new Pawn(false, 1, 6); pieces.add(BPeon2);
        BPeon3 = new Pawn(false, 2, 6); pieces.add(BPeon3);
        BPeon4 = new Pawn(false, 3, 6); pieces.add(BPeon4);
        BPeon5 = new Pawn(false, 4, 6); pieces.add(BPeon5);
        BPeon6 = new Pawn(false, 5, 6); pieces.add(BPeon6);
        BPeon7 = new Pawn(false, 6, 6); pieces.add(BPeon7);
        BPeon8 = new Pawn(false, 7, 6); pieces.add(BPeon8);
    }
    public void fillBoard() {
        for (int row = 0; row < DIMENSION; row++) {
            for (int col = 0; col < DIMENSION; col++) {
                for (Piece piece : pieces) {
                    if (piece.getInitPosX() == col && piece.getInitPosY() == row) {
                        board[row][col] = piece;
                    }
                }
            }
        }
    }
    public Piece[][] getBoard() {
        return board;
    }
    public void clearBoard() {

    }

    public void drawBoard() {
        for (int row = 0; row < DIMENSION; row++) {
            System.out.print(row + 1 + " | ");
            for (int col = 0; col < DIMENSION; col++) {
                if(board[row][col] != null) {
                    String figure = board[row][col].getFigure() + " ";
                    System.out.print(figure);
                } else {
                  System.out.print(" ");
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
