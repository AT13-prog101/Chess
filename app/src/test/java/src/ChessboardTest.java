package src;

import org.junit.Test;
import src.Pieces.Piece;

import static org.junit.Assert.*;

public class ChessboardTest {
    @Test
    public void invalidQueneMoveTest() {
        Chessboard chessboard = new Chessboard();
        Player playerWhite = new Player("Player1", true);
        Position source = new Position("d1");
        Position target = new Position("d2");
        boolean expected= false;
        boolean actual = chessboard.movePiece(source,target,playerWhite);
        assertEquals(expected, actual);
    }
    @Test
    public void validMovePawnTest() {
        Chessboard chessboard = new Chessboard();
        Player playerWhite = new Player("Player1", true);
        Position source = new Position("b1");
        Position target = new Position("a3");
        boolean expected= true;
        boolean actual = chessboard.movePiece(source,target,playerWhite);
        assertEquals(expected, actual);
    }
}

