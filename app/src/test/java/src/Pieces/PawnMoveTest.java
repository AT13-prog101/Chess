package src;

import org.junit.Test;
import src.Pieces.Piece;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PawnMoveTest {
    /**
     * PositionTraductor switches from one notation to the other.
     *
     *               ALGEBRAIC                         MATRIX
     *      8| BR BH BB BQ BK BB BH BR      0| BR BH BB BQ BK BB BH BR
     *      7| BP BP BP BP BP BP BP BP      1| BP BP BP BP BP BP BP BP
     *      6|                              2|
     *      5|                              3|
     *      4|                          ==> 4|
     *      3|                              5|
     *      2| WP WP WP WP WP WP WP WP      6| WP WP WP WP WP WP WP WP
     *      1| WR WH WB WQ WK WB WH WR      7| WR WH WB WQ WK WB WH WR
     *        ------------------------         -----------------------
     *         a  b  c  d  e  f  g  h          0  1  2  3  4  5  6  7
     */
    @Test
    public void getValidMovesPawnAtPos_6_1() {
        Chessboard chessboard = new Chessboard();
        Piece pawn = Chessboard.board[6][1];
        List<Position> validMoves = pawn.getValidMoves();
        String expected = "b4 b3" + " ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }
    @Test
    public void getValidMovesPawnAtPos_6_2() {
        Chessboard chessboard = new Chessboard();
        Piece pawn = Chessboard.board[6][2];
        List<Position> validMoves = pawn.getValidMoves();
        String expected = "c4 c3" + " ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }
    @Test
    public void getValidMovesPawnAtPos_6_0() {
        Chessboard chessboard = new Chessboard();
        Piece pawn = Chessboard.board[6][0];
        List<Position> validMoves = pawn.getValidMoves();
        String expected = "a4 a3" + " ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }
}
