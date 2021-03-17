package src;

import org.checkerframework.checker.units.qual.A;
import src.Pieces.Piece;

import javax.swing.text.Position;
import java.util.ArrayList;

public class Chessboard {
    public final static int DIMENSION = 8;
    private Piece[][] board;
    private Team whiteTeam;
    private Team blackTeam;
    PositionTraductor positionTraductor = new PositionTraductor();;
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

    /**
     * Obtains the array of all possible moves for a piece given its position.
     */
    public ArrayList<String> getPieceValidMoves (String position) {
        ArrayList<String> validMoves = null;
        Piece piece;
        if(whiteTeam.thereIsPiece(position)) {
            piece = whiteTeam.getPiece(position);
        } else {
            piece = blackTeam.getPiece(position);
        }
        validMoves = piece.getValidMoves(position);
        return validMoves;
    }
    public boolean isCheckmate () {
        return false;
    }
    public void movePiece(String[] moveToMake, Player player) {
        String Source = moveToMake[0];
        String Target = moveToMake[1];
        ArrayList<String> validMoves = new ArrayList<String>();
        if (player.getColor().equals("White")) {
            whiteTeam.getPiece(Source);
        }
    }
}
