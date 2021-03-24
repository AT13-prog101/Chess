package src.Pieces;

import org.junit.Test;
import src.Chessboard;
import src.Pieces.Piece;
import src.Position;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class KnightMoveTest {
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
    public void getValidMovesKnightAtPos_1_7() {
        Chessboard chessboard = new Chessboard();
        Piece knight = Chessboard.board[7][1].getPiece();
        List<Position> validMoves = knight.getValidMoves();
        String expected = "c3 a3" + " ";
        String actual = "";
        for (Position pos : validMoves) {
            actual += String.valueOf(pos.getCharAlg()) + " ";
        }
        assertEquals(expected, actual);
    }
}
