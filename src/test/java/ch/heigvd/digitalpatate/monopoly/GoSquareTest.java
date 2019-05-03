package ch.heigvd.digitalpatate.monopoly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest {

    @Test
    void landedOnShouldIncreaseMonoyOfPlayer() {
        Player p = new Player(null,null,new Board());
        GoSquare goSquare = new GoSquare();
        int beforeCash = p.getNetWorth();
        goSquare.landedOn(p);
        assert(beforeCash< p.getNetWorth());
    }
}