package ch.heigvd.digitalpatate.monopoly.cup;

import ch.heigvd.digitalpatate.monopoly.cup.Cup;
import ch.heigvd.digitalpatate.monopoly.cup.Die;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    private PipedDice pipedDice;
    private Cup cup;
    private class PipedDice extends Die {
        private int pipedFaceValue;
        public PipedDice(int FACE_COUNT) {
            super(FACE_COUNT);
        }

        @Override
        public void roll() {
            pipedFaceValue =6;
        }

        @Override
        public int getFaceValue() {
            return pipedFaceValue;
        }
    }


    @BeforeEach
    void init(){
        this.pipedDice = new PipedDice(6);
        this.cup = new Cup(pipedDice,pipedDice);
    }
  
    @Test
    void getTotalWithPipedValue() {
        cup.roll();
        assertEquals(cup.getTotal(),pipedDice.getFaceValue()*2);
    }
}