package ch.heigvd.digitalpatate.monopoly;

public class GoSquare extends Square {

    public GoSquare() {
        super("Go", 0);
    }

    @Override
    public void landedOn(Player p) {
            p.addCash(200);
    }


}
