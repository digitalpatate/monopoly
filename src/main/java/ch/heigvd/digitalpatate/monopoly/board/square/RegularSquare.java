package ch.heigvd.digitalpatate.monopoly.board.square;

import ch.heigvd.digitalpatate.monopoly.player.Player;

public class RegularSquare extends Square {


    public RegularSquare(String name, int index) {
        super(name, index);
    }

    @Override
    public void landedOn(Player p) {
        //nothing to implement
    }


}
