package ch.heigvd.digitalpatate.monopoly.cup;

import java.util.Random;

public class Die {

    private static final Random random = new Random();

    private final int FACE_COUNT;
    private int faceValue;

    public Die(int FACE_COUNT) {
        this.FACE_COUNT = FACE_COUNT;

        roll();
    }

    public void roll() {
        faceValue = random.nextInt(FACE_COUNT) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
