package ch.heigvd.digitalpatate.monopoly;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @RepeatedTest(value = 40, name = "Square {currentRepetition}")
    void squaresAreNamedCorrectly(RepetitionInfo repetitionInfo) {

        int i = repetitionInfo.getCurrentRepetition()-1;
        String name;

        switch (i) {

            case 0:
                name = "Go";
                break;
            case 10:
                name = "GoToJail";
                break;
            case 2:
                name = "Tax";
                break;
            case 38:
                name = "Tax";
                break;
            case 30:
                name = "Jail";
                break;


            default:
                name = "Square " + i;
        }

        Board board = new Board();


        assertEquals(board.getSquareAt(i).getName(), name);
    }
}