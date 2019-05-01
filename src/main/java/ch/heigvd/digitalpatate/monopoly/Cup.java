package ch.heigvd.digitalpatate.monopoly;

public class Cup {

    private Die[] dices;
    private int total;


    public Cup(Die n1, Die n2) {

        dices = new Die[]{n1, n2};

    }

    public void roll(){

        total=0;

        for (int i = 0; i < dices.length; ++i) {
            dices[i].roll();
            total += dices[i].getFaceValue();
        }

    }

    public int getTotal() {
        return total;
    }
}
