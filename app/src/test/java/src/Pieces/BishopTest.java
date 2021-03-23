package src.Pieces;

import org.junit.Test;
import src.Chessboard;
import src.GetPieceFactory;
import src.Position;
import src.TypePiece;

import java.util.List;

import static org.junit.Assert.*;

public class BishopTest {

    private void chessboardScenario() {
        Chessboard chessboard = new Chessboard();
        int dimensionBoard = 8;
        chessboard.board = new Piece[dimensionBoard][dimensionBoard];
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.ROOK, false,3,3));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.KING, true, 6, 1));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.PAWN, false,2,3));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.QUEEN, true,5,6));
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
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.BISHOP, true, 7, 0));
        Piece bishop = Chessboard.board[0][7];
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
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.BISHOP, true, 7, 7));
        Piece bishop = Chessboard.board[7][7];
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
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.BISHOP, true, 0, 7));
        Piece bishop = Chessboard.board[7][0];
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
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.BISHOP, true, 0, 0));
        Piece bishop = Chessboard.board[0][0];
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
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.BISHOP, true, 3, 4));
        Piece bishop = Chessboard.board[4][3];
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
        Bishop bishop = new Bishop(false, inicialPocionX, inicialPocionY);
        char actual = bishop.getColor();
        char expected = 'B';
        assertEquals(expected, actual);
    }

    @Test
    public void bishopIsWhite_inputTrue_W() {
        int inicialPocionX = 4;
        int inicialPocionY = 5;
        Bishop bishop = new Bishop(true, inicialPocionX, inicialPocionY);
        char actual = bishop.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void getFigureKing_choseBishop_B() {
        int inicialPocionX = 7;
        int inicialPocionY = 0;
        Bishop bishop = new Bishop(true, inicialPocionX, inicialPocionY);
        char actual = bishop.getFigure();
        char expected = 'B';
        assertEquals(expected, actual);
    }
}