package ch.heigvd.digitalpatate.monopoly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DieTest {

    final int FACE_COUNT = 6;

    @Test
    @DisplayName("Die Roll test")
    void aNewDieIsRolled() {

        Die dice = new Die(FACE_COUNT);
        assertTrue(dice.getFaceValue() > 0 && dice.getFaceValue() <= FACE_COUNT);
    }

}
