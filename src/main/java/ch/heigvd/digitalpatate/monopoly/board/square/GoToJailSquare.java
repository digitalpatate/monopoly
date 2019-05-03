package ch.heigvd.digitalpatate.monopoly.board.square;

import ch.heigvd.digitalpatate.monopoly.player.Player;

public class GoToJailSquare extends Square {


    public GoToJailSquare() {
        super("GoToJail", 10);
    }

    @Override
    public void landedOn(Player p) {
        p.getPiece().setLocation(new RegularSquare("jail",30));
    }
}
