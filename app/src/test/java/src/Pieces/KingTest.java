package src.Pieces;

import org.junit.Test;
import src.*;
import src.Pieces.King;
import src.Pieces.Piece;

import java.util.List;

import static org.junit.Assert.*;

public class KingTest {

    private void chessboardScenario() {
        Chessboard chessboard = new Chessboard();
        PieceFactory pieceFactory = new PieceFactory();
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.BISHOP, true, new Position(4, 4)));
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.HORSE, false, new Position(4, 5)));
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.PAWN, false, new Position(2, 5)));
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.ROOK, true, new Position(2, 3)));
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.KING, false, new Position(3, 4)));

        /**
         * 8 |
         * 7 |
         * 6 |
         * 5 |       WR
         * 4 |          BK WB
         * 3 |       BP    BH
         * 2 |
         * 1 |
         *    -----------------------
         *     a  b  c  d  e  f  g  h
         */

    }
    @Test
    public void getValidMovesKing_d4_fiveValidMoves() {
        chessboardScenario();
        Piece king = Chessboard.board[4][3].getPiece();
        List<Position> validMoves = king.getValidMoves();
        String expected = "e5 c5 d5 c4 e4 d3 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }

    @Test
    public void getValidMovesKing_h8_threeValidMoves() {
        chessboardScenario();
        PieceFactory pieceFactory = new PieceFactory();
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.KING, true, new Position(7, 0)));
        Piece king = Chessboard.board[0][7].getPiece();

        List<Position> validMoves = king.getValidMoves();
        String expected = "g7 g8 h7 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }

    @Test
    public void getValidMovesKing_a8_threeValidMoves() {
        chessboardScenario();
        PieceFactory pieceFactory = new PieceFactory();
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.KING, true, new Position(0, 0)));
        Piece king = Chessboard.board[0][0].getPiece();

        List<Position> validMoves = king.getValidMoves();
        String expected = "b7 b8 a7 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }

    @Test
    public void getValidMovesKing_h1_threeValidMoves() {
        chessboardScenario();
        PieceFactory pieceFactory = new PieceFactory();
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.KING, true, new Position(7, 7)));
        Piece king = Chessboard.board[7][7].getPiece();

        List<Position> validMoves = king.getValidMoves();
        String expected = "g2 h2 g1 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }
    @Test
    public void getValidMovesKing_a1_threeValidMoves() {
        chessboardScenario();
        PieceFactory pieceFactory = new PieceFactory();
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.KING, true, new Position(0, 7)));
        Piece king = Chessboard.board[7][0].getPiece();

        List<Position> validMoves = king.getValidMoves();
        String expected = "b2 a2 b1 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }

    @Test
    public void kingIsBlack_inputFalse_B() {
        int inicialPocionX = 4;
        int inicialPocionY = 4;
        King king = new King(false, new Position(inicialPocionX, inicialPocionY));
        char actual = king.getColor();
        char expected = 'B';
        assertEquals(expected, actual);
    }

    @Test
    public void kingIsWhite_inputTrue_W() {
        int inicialPocionX = 4;
        int inicialPocionY = 4;
        King king = new King(true, new Position(inicialPocionX, inicialPocionY));
        char actual = king.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void getFigureKing_choseKing_K() {
        int inicialPocionX = 4;
        int inicialPocionY = 4;
        King king = new King(true, new Position(inicialPocionX, inicialPocionY));
        char actual = king.getFigure();
        char expected = 'K';
        assertEquals(expected, actual);
    }
}