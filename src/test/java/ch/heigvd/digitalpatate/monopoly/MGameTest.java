package ch.heigvd.digitalpatate.monopoly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class MGameTest {

    @Test
    @DisplayName("Correct amount of players")
    void aNewMGameHasTheGivenNumberOfPlayer() {

        int playerCount = 4;

        MGame mGame = new MGame(playerCount);

        assertEquals(mGame.getPlayers().length, playerCount);

        for (Player player : mGame.getPlayers()) {
            assertNotNull(player);
        }
    }

    @Test
    @DisplayName("Lowest amount of players")
    void itCannotHaveLessThanTwoPlayers() {

        final int playerCount = 1;

        assertThrows(IllegalArgumentException.class, () -> new MGame(playerCount));
    }

    @Test
    @DisplayName("Max amount of players")
    void itCannotHaveMoreThanHeightPlayers() {

        final int playerCount = 9;

        assertThrows(IllegalArgumentException.class, () -> new MGame(playerCount));
    }



}