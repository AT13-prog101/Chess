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