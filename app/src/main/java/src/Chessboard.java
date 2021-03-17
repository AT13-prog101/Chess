package src;

import org.checkerframework.checker.units.qual.A;
import src.Pieces.Piece;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.List;

public class Chessboard {
    public final static int DIMENSION = 8;
    public static Piece[][] board = new Piece[DIMENSION][DIMENSION];
    private Team whiteTeam;
    private Team blackTeam;
    PositionTraductor positionTraductor = new PositionTraductor();;
    public Chessboard() {
        initializeChessboard();
    }

    /**
     * Creates teams and instanciates pieces into teams.
     */
    public void initializeChessboard() {
        whiteTeam = new WhiteTeam();
        whiteTeam.initializeTeam();
        blackTeam = new BlackTeam();
        blackTeam.initializeTeam();
        fillBoard();
    }

    /**
     * Reference teams' pieces in board
     */
    public void fillBoard() {
        fillBoardWithNull();
        List<Piece> whitePieces = whiteTeam.getSetOfPieces();
        List<Piece> blackPieces = blackTeam.getSetOfPieces();
        for (int i = 0; i < whitePieces.size(); i++) {
            Piece whitePiece = whitePieces.get(i);
            Piece blackPiece = blackPieces.get(i);
            board[whitePiece.getInitPosY()][whitePiece.getInitPosX()] = whitePiece;
            board[blackPiece.getInitPosY()][blackPiece.getInitPosX()] = blackPiece;
        }
    }
    public void fillBoardWithNull() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                board[i][j] = null;
            }
        }
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
