package src;

import src.Pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Chessboard extends JFrame {
    public final static int DIMENSION = 8;
    private static final int SIZE_IMAGE = 80;
    private static final int SIZE_WINDOW_WIDTH = DIMENSION * SIZE_IMAGE;
    private static final int SIZE_WINDOW_HEIGHT = DIMENSION * SIZE_IMAGE;
    public static Piece[][] board = new Piece[DIMENSION][DIMENSION];;
    private Team whiteTeam;
    private Team blackTeam;
    private Player winner;
    private final boolean IS_PLAYER_WHITE = true;

    /**
     * Chessboard initializes the pieces from its Team instances
     */
    public Chessboard() {
        initializeChessboard();
    }
    public void initializeChessboard() {
        setSize(SIZE_WINDOW_WIDTH, SIZE_WINDOW_HEIGHT);
        setTitle("AT13-CHESS");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        setLayout(new GridLayout(DIMENSION, DIMENSION));
        addBoardCells();
        whiteTeam = new Team(IS_PLAYER_WHITE);
        blackTeam = new Team(!IS_PLAYER_WHITE);
    }
    /**
     * Creates BoardCells and adds them to the chessboard matrix
     */
    public void addBoardCells() {
        boolean pieceWhite = true;
        for (int row = 0; row < DIMENSION; row++) {
            for (int col = 0; col < DIMENSION; col++) {
                JLabel label = new JLabel();
                label.setForeground(Color.WHITE);
                label.setName("BoardCell");
                label.setOpaque(true);
                if(pieceWhite) {
                    label.setBackground(Color.GRAY);
                } else {
                    label.setBackground(Color.darkGray);
                }
                if (col < 7) {
                    pieceWhite = !pieceWhite;
                }
                add(label);
            }
        }
    }
    /**
     * Prints the board in console
     */
    public void printBoard() {
        System.out.println("   ---------------------------------------");
        for (int row = 0; row < DIMENSION; row++) {
            System.out.print(DIMENSION - row + " |");
            for (int col = 0; col < DIMENSION; col++) {
                if (board[row][col] != null) {
                    Piece piece = board[row][col];
                    String figure = " " + String.valueOf(piece.getColor()) + String.valueOf(piece.getFigure()) + " |";
                    System.out.print(figure);
                } else {
                    System.out.print("    " + "|");
                }
            }
            System.out.println("");
            System.out.println("  |---------------------------------------");
        }
        System.out.println("    a    b    c    d    e    f    g    h");
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
        if (player.isWhite() == piece.getColorWhite()) {
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
