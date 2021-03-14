package src;

import static org.junit.Assert.*;
import org.junit.Test;

public class WhiteTeamTest {
    @Test
    public void piecesAreCreatedForWhiteTeam() {
        Team whiteTeam = new WhiteTeam();
        whiteTeam.initializeTeam();
        boolean expected = true;
        boolean actual = whiteTeam.thereIsPiece(6, 6);
        assertEquals(expected, actual);
    }
}
