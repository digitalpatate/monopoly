package ch.heigvd.digitalpatate.monopoly.board;

import ch.heigvd.digitalpatate.monopoly.board.Board;
import ch.heigvd.digitalpatate.monopoly.board.square.GoSquare;
import ch.heigvd.digitalpatate.monopoly.player.Player;
import org.junit.jupiter.api.Test;

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