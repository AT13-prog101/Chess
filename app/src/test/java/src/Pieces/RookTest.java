package src.Pieces;

import org.junit.Test;
import src.Chessboard;
import src.GetPieceFactory;
import src.Position;
import src.TypePiece;

import java.util.List;

import static org.junit.Assert.*;

public class RookTest {

    private void chessboardScenario() {
        Chessboard chessboard = new Chessboard();
        chessboard.board = new Piece[Chessboard.DIMENSION][Chessboard.DIMENSION];
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.PAWN, false, new Position(2, 3)));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.KING, true, new Position(3, 0)));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.BISHOP, true, new Position(3, 5)));
        /**
         *   | ---------------------------------------
         * 8 |    |    |    | WK |    |    |    |    |
         *   |---------------------------------------
         * 7 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         * 6 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         * 5 |    |    | BP |    |    |    |    |    |
         *   |---------------------------------------
         * 4 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         * 3 |    |    |    | WB |    |    |    |    |
         *   |---------------------------------------
         * 2 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         * 1 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         *     a    b    c    d    e    f    g    h
         */
    }
    @Test
    public void getValidMovesBishopWhite_h1_fourteenValidMoves() {
        chessboardScenario();
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.ROOK, false, new Position(7, 7)));
        Rook rook = (Rook) Chessboard.board[7][7];
        List<Position> validMoves = rook.getValidMoves();
        String expected = "g1 f1 e1 d1 c1 b1 a1 h2 h3 h4 h5 h6 h7 h8 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }

    @Test
    public void getValidMovesBishopBlack_h8_elevenValidMoves() {
        chessboardScenario();
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.ROOK, false, new Position(7, 0)));
        Rook rook = (Rook) Chessboard.board[0][7];
        List<Position> validMoves = rook.getValidMoves();
        String expected = "g8 f8 e8 d8 h7 h6 h5 h4 h3 h2 h1 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }

    @Test
    public void getValidMovesBishopBlack_a1_fourteenValidMoves() {
        chessboardScenario();
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.ROOK, false, new Position(0, 7)));
        Rook rook = (Rook) Chessboard.board[7][0];
        List<Position> validMoves = rook.getValidMoves();
        String expected = "b1 c1 d1 e1 f1 g1 h1 a2 a3 a4 a5 a6 a7 a8 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }
    @Test
    public void getValidMovesBishopBlack_d5_eightValidMoves() {
        chessboardScenario();
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.ROOK, false, new Position(3, 3)));
        Rook rook = (Rook) Chessboard.board[3][3];
        List<Position> validMoves = rook.getValidMoves();
        String expected = "e5 f5 g5 h5 d4 d3 d6 d7 d8 ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }
    @Test
    public void rookIsBlack_inputFalse_B() {
        int inicialPocionX = 8;
        int inicialPocionY = 2;
        Rook rook = new Rook(true, new Position(inicialPocionX, inicialPocionY));
        char actual = rook.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void rookIsWhite_inputTrue_W() {
        int inicialPocionX = 8;
        int inicialPocionY = 2;
        Rook rook = new Rook(true, new Position(inicialPocionX, inicialPocionY));
        char actual = rook.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void getFigureRook_choseRook_R() {
        int inicialPocionX = 7;
        int inicialPocionY = 6;
        Rook rook = new Rook(true, new Position(inicialPocionX, inicialPocionY));
        char actual = rook.getFigure();
        char expected = 'R';
        assertEquals(expected, actual);
    }
}