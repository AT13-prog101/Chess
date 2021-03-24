package src;

import org.junit.Test;
import src.Pieces.Piece;

import static org.junit.Assert.assertEquals;

public class PieceFactoryTest {
    @Test
    public void getPawnFigurefromGetfactory() {
        PieceFactory pieceFactory = new PieceFactory();
        TypePiece name = TypePiece.PAWN;
        Piece pawn = pieceFactory.getPiece(name, true, new Position(0, 0));
        char expected = 'P';
        char actual = pawn.getFigure();
        assertEquals(expected, actual);
    }
    @Test
    public void getQueenFigurefromGetfactory() {
        PieceFactory pieceFactory = new PieceFactory();
        TypePiece name = TypePiece.QUEEN;
        Piece queen = pieceFactory.getPiece(name, true, new Position(6, 5));
        char expected = 'Q';
        char actual = queen.getFigure();
        assertEquals(expected, actual);
    }
    @Test
    public void getPositionXFromPiecefromGetfactory() {
        PieceFactory pieceFactory = new PieceFactory();
        TypePiece name = TypePiece.PAWN;
        Piece pawn = pieceFactory.getPiece(name, true, new Position(7, 7));
        int expected = 7;
        int actual = pawn.getPosX();
        assertEquals(expected, actual);
    }
}
