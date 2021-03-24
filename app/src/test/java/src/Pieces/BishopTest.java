package src.Pieces;

import org.junit.Test;
import src.Chessboard;
import src.PieceFactory;
import src.Pieces.Bishop;
import src.Pieces.Piece;
import src.Position;
import src.TypePiece;

import java.util.List;

import static org.junit.Assert.*;

public class BishopTest {

    private void chessboardScenario() {
        Chessboard chessboard = new Chessboard();
        PieceFactory pieceFactory = new PieceFactory();
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.ROOK, false, new Position(3, 3)));
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.KING, true, new Position(6, 1)));
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.PAWN, false, new Position(2, 3)));
        Chessboard.setPiece(pieceFactory.getPiece(TypePiece.QUEEN, true, new Position(5, 6)));
        /**
         *   ---------------------------------------
         * 8 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         * 7 |    |    |    |    |    |    | WK |    |
         *   |---------------------------------------
         * 6 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         * 5 |    |    | BP | BR |    |    |    |    |
         *   |---------------------------------------
         * 4 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         * 3 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         * 2 |    |    |    |    |    | WQ |    |    |
         *   |---------------------------------------
         * 1 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         *     a    b    c    d    e    f    g    h
         */
    }
    @Test
    public void getValidMovesBishop_h8_zeroValidMoves() {
        chessboardScenario();
        PieceFactory pieceFactory = new PieceFactory();
        Piece bishop = pieceFactory.getPiece(TypePiece.BISHOP, true, new Position(7, 0));
        Chessboard.setPiece(bishop);
        List<Position> validMoves = bishop.getValidMoves();
        String expected = "";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }
    @Test
    public void getValidMovesBishop_h1_fiveValidMoves() {
        chessboardScenario();
        PieceFactory pieceFactory = new PieceFactory();
        Piece bishop = pieceFactory.getPiece(TypePiece.BISHOP, true, new Position(7, 7));
        Chessboard.setPiece(bishop);
        List<Position> validMoves = bishop.getValidMoves();
        String expected = "g2 f3 e4 d5 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }


    @Test
    public void getValidMovesBishop_a1_fiveValidMoves() {
        chessboardScenario();
        PieceFactory pieceFactory = new PieceFactory();
        Piece bishop = pieceFactory.getPiece(TypePiece.BISHOP, true, new Position(0, 7));
        Chessboard.setPiece(bishop);
        List<Position> validMoves = bishop.getValidMoves();
        String expected = "b2 c3 d4 e5 f6 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }

    @Test
    public void getValidMovesBishop_a8_threeValidMoves() {
        chessboardScenario();
        PieceFactory pieceFactory = new PieceFactory();
        Piece bishop = pieceFactory.getPiece(TypePiece.BISHOP, true, new Position(0, 0));
        Chessboard.setPiece(bishop);
        List<Position> validMoves = bishop.getValidMoves();
        String expected = "b7 c6 d5 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }

    @Test
    public void getValidMovesBishop_d4_sevenValidMoves() {
        chessboardScenario();
        PieceFactory pieceFactory = new PieceFactory();
        Piece bishop = pieceFactory.getPiece(TypePiece.BISHOP, true, new Position(3, 4));
        Chessboard.setPiece(bishop);
        List<Position> validMoves = bishop.getValidMoves();
        String expected = "e3 c5 e5 f6 c3 b2 a1 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }

    @Test
    public void bishopIsWhite_inputFalse_B() {
        int inicialPocionX = 6;
        int inicialPocionY = 0;
        Bishop bishop = new Bishop(false, new Position(inicialPocionX, inicialPocionY));
        char actual = bishop.getColor();
        char expected = 'B';
        assertEquals(expected, actual);
    }

    @Test
    public void bishopIsWhite_inputTrue_W() {
        int inicialPocionX = 4;
        int inicialPocionY = 5;
        Bishop bishop = new Bishop(true, new Position(inicialPocionX, inicialPocionY));
        char actual = bishop.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void getFigureKing_choseBishop_B() {
        int inicialPocionX = 7;
        int inicialPocionY = 0;
        Bishop bishop = new Bishop(true, new Position(inicialPocionX, inicialPocionY));
        char actual = bishop.getFigure();
        char expected = 'B';
        assertEquals(expected, actual);
    }
}