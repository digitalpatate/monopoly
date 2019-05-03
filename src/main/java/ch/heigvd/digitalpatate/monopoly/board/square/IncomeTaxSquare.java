package ch.heigvd.digitalpatate.monopoly.board.square;

import ch.heigvd.digitalpatate.monopoly.player.Player;

public class IncomeTaxSquare extends Square {

    public IncomeTaxSquare( int index) {
        super("Tax", index);
    }

    @Override
    public void landedOn(Player p) {

       int w= p.getNetWorth();

       p.reduceCash(Math.min(200,(int)(0.1*w)));
    }
}
