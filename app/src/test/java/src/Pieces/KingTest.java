package src.Pieces;

import org.junit.Test;
import src.*;

import java.util.List;

import static org.junit.Assert.*;

public class KingTest {
    private void chessboardScenario() {
        Chessboard chessboard = new Chessboard();
        int dimensionBoard = 8;
        chessboard.board = new Piece[dimensionBoard][dimensionBoard];
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        chessboard.board[4][4] = getPieceFactory.getPiece(TypePiece.BISHOP, true, 4, 4);
        chessboard.board[5][4] = getPieceFactory.getPiece(TypePiece.HORSE, false, 5, 4);
        chessboard.board[5][2] = getPieceFactory.getPiece(TypePiece.PAWN, false, 2, 5);
        chessboard.board[3][2] = getPieceFactory.getPiece(TypePiece.ROOK, true, 2, 3);
        chessboard.board[4][3] = getPieceFactory.getPiece(TypePiece.KING, false, 3, 4);

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
        Piece king = Chessboard.board[4][3];
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
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.KING, true, 7, 0));
        Piece king = Chessboard.board[0][7];

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
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.KING, true, 0, 0));
        Piece king = Chessboard.board[0][0];

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
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.KING, true, 7, 7));
        Piece king = Chessboard.board[7][7];

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
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.KING, true, 0, 7));
        Piece king = Chessboard.board[7][0];

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
        King king = new King(false, inicialPocionX, inicialPocionY);
        char actual = king.getColor();
        char expected = 'B';
        assertEquals(expected, actual);
    }

    @Test
    public void kingIsWhite_inputTrue_W() {
        int inicialPocionX = 4;
        int inicialPocionY = 4;
        King king = new King(true, inicialPocionX, inicialPocionY);
        char actual = king.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void getFigureKing_choseKing_K() {
        int inicialPocionX = 4;
        int inicialPocionY = 4;
        King king = new King(true, inicialPocionX, inicialPocionY);
        char actual = king.getFigure();
        char expected = 'K';
        assertEquals(expected, actual);
    }
}