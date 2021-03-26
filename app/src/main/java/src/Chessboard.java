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
    private final int posXCastlingKingSide = 6;
    private final int posXCastlingQueenSide = 2;

    public static  Piece getPiece(Position position) {
        Piece piece = board[position.getPosY()][position.getPosX()];
        return piece;
    }

    /**
     * Chessboard initializes the pieces from its Team instances
     */
    public Chessboard() {

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

    /**
     * Checks if a piece can be moved in the board while checking if the move is
     * castling or the king has been taken
     */
    public boolean movePiece(Position source, Position target, Player player) {
        List<Position> validMoves = getValidMoves(source, player);
        if (validMoves.contains(target)) {
            if (board[source.getPosY()][source.getPosX()].getFigure() == 'K') {
                return checkCastlingMove(source, target, validMoves);
            }
            Piece pieceToMove = Chessboard.board[source.getPosY()][source.getPosX()];
            if (Chessboard.board[target.getPosY()][target.getPosX()] != null) {
               if (Chessboard.board[target.getPosY()][target.getPosX()].getFigure() == 'K') {
                  winner = player;
               }
            }
                moveFromSourceToTarget(source, target);
                return true;
        }
        return false;
    }

    /**
     * Update the piece on the chessboard given a source and target position.
     */
    public void moveFromSourceToTarget(Position source, Position target) {
        Piece pieceToMove = board[source.getPosY()][source.getPosX()];
        pieceToMove.updatePosition(new Position(target.getPosX(), target.getPosY()));
        Chessboard.board[target.getPosY()][target.getPosX()] = pieceToMove;
        Chessboard.board[source.getPosY()][source.getPosX()] = null;
    }

    /**
     * Returns the player who made the move to take the king
     */
    public Player kingTakenBy() {
        return winner;
    }
    /**
     * Returns all the valid moves a piece from the given source position can make.
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
     * Checks if a valid castling move has been made and makes the move.
     */
    public boolean checkCastlingMove(Position source, Position target, List<Position> validMoves) {
        int posXCastling = DIMENSION;
        int posXRookSource = DIMENSION;
        int posXRookTarget = DIMENSION;
        for (Position pos : validMoves) {
            if (pos.getPosX() == posXCastlingKingSide) {
                posXCastling = posXCastlingKingSide;
                posXRookSource = DIMENSION - 1;
                posXRookTarget = posXCastling - 1;
            } else {
                if (pos.getPosX() == posXCastlingQueenSide) {
                    posXCastling = posXCastlingQueenSide;
                    posXRookSource = 0;
                    posXRookTarget = posXCastling + 1;
                }
            }
            if (target.equals(pos) && posXCastling != DIMENSION) {
                Position rookTarget = new Position(posXRookTarget, pos.getPosY());
                Position rookSource = new Position(posXRookSource, pos.getPosY());
                moveFromSourceToTarget(source, target);
                moveFromSourceToTarget(rookSource, rookTarget);
                return true;
            }
        }
        return false;
    }

    /**
     * Prints on console the valid moves a piece can make
     */
    public void printValidMoves(List<Position> validMoves) {
        for (Position pos : validMoves) {
            System.out.println(pos.getCharAlg() + " ");
        }
    }

    /**
     * Checks if there is a piece in the chessboard in the given position
     */
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

    /**
     * setPiece with a position and piece
     */
    public static void setPiece(Piece piece) {
        Chessboard.board[piece.getPosY()][piece.getPosX()] = piece;
    }
    public void resetChessBoard(){
        for (int row = 0; row < DIMENSION; row++) {
            for (int col = 0; col < DIMENSION; col++) {
                board[row][col] = null;
            }
        }
    }
}
