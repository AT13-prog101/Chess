package src.Pieces;

import org.junit.Test;
import src.Chessboard;
import src.GetPieceFactory;
import src.Position;
import src.TypePiece;

import static org.junit.Assert.*;

public class QueenTest {
    Chessboard chessboard;

    private void chessboardScenario() {
        chessboard = new Chessboard();
        int dimensionBoard = 8;
        chessboard.board = new Piece[dimensionBoard][dimensionBoard];
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.BISHOP, false, new Position(3, 3)));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.HORSE, false, new Position(6, 6)));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.PAWN, true, new Position(3, 5)));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.ROOK, true, new Position(6, 2)));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.KING, false, new Position(1, 4)));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.ROOK, false, new Position("f4")));
        Chessboard.setPiece(getPieceFactory.getPiece(TypePiece.HORSE, false, new Position("e8")));
        /**
         *    ---------------------------------------
         * 8 |    |    |    |    | BH |    |    |    |
         *   |---------------------------------------
         * 7 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         * 6 |    |    |    |    |    |    | WR |    |
         *   |---------------------------------------
         * 5 |    |    |    | BB |    |    |    |    |
         *   |---------------------------------------
         * 4 |    | BK |    |    |    | BR |    |    |
         *   |---------------------------------------
         * 3 |    |    |    | WP |    |    |    |    |
         *   |---------------------------------------
         * 2 |    |    |    |    |    |    | BH |    |
         *   |---------------------------------------
         * 1 |    |    |    |    |    |    |    |    |
         *   |---------------------------------------
         *     a    b    c    d    e    f    g    h
         */
    }

    @Test
    public void queenIsBlack_InputFalse_B() {
        int inicialPocionX = 4;
        int inicialPocionY = 4;
        Queen queen = new Queen(false, new Position(inicialPocionX, inicialPocionY));
        char actual = queen.getColor();
        char expected = 'B';
        assertEquals(expected, actual);
    }
    @Test
    public void queenIsWhite_InputTrue_W() {
        int inicialPocionX = 5;
        int inicialPocionY = 6;
        Queen queen = new Queen(true, new Position(inicialPocionX, inicialPocionY));
        char actual = queen.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void getFigureQueen_ChoseQueen_Q() {
        int inicialPocionX = 4;
        int inicialPocionY = 3;
        Queen queen = new Queen(true, new Position(inicialPocionX, inicialPocionY));
        char actual = queen.getFigure();
        char expected = 'Q';
        assertEquals(expected, actual);
    }
}