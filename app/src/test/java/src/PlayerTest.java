package src;

import org.junit.Test;
import src.Pieces.Piece;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void getColorCreatingAWhitePlayerReturnsWhite() {
        Player player1 = new Player("player1", true);
        boolean expected = true;
        boolean actual = player1.isWhite();
        assertEquals(expected, actual);
    }
}
