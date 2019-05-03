package ch.heigvd.digitalpatate.monopoly.board.square;

import ch.heigvd.digitalpatate.monopoly.player.Player;

public class GoSquare extends Square {

    public GoSquare() {
        super("Go", 0);
    }

    @Override
    public void landedOn(Player p) {
            p.addCash(200);
    }


}
