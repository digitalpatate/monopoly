package ch.heigvd.digitalpatate.monopoly;

import ch.heigvd.digitalpatate.monopoly.player.Player;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MGameTest {

    private MGame mGame;

    @BeforeEach
    void init(){
        this.mGame = new MGame(4);
    }

    @Test
    @DisplayName("Correct amount of players")
    void aNewMGameHasTheGivenNumberOfPlayer() {


        assertEquals(mGame.getPlayers().length, 4);

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