package ch.heigvd.digitalpatate.monopoly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MGameTest {

    @Test
    void aNewMGameHasTheGivenNumberOfPlayer() {

        int playerCount = 4;

        MGame mGame = new MGame(playerCount);

        assertEquals(mGame.getPlayers().length, playerCount);

        for (Player player : mGame.getPlayers()) {
            assertNotNull(player);
        }
    }

    @Test()
    void itCannotHaveLessThanTwoPlayers() {

        final int playerCount = 1;

        assertThrows(IllegalArgumentException.class, () -> new MGame(playerCount));
    }

    @Test()
    void itCannotHaveMoreThanHeightPlayers() {

        final int playerCount = 9;

        assertThrows(IllegalArgumentException.class, () -> new MGame(playerCount));
    }


}