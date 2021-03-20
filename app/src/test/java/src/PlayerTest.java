package src;

import org.junit.Test;
import src.Pieces.Piece;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void getColorCreatingAWhitePlayerReturnsWhite() {
        Player player1 = new Player("player1", "White");
        String expected = "White";
        String actual = player1.getColor();
        assertEquals(expected, actual);
    }
}
