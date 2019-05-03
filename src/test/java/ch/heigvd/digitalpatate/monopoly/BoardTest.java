package ch.heigvd.digitalpatate.monopoly;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    static Board board;

    @BeforeAll
    static void init() {
        board=new Board();
    }

    @RepeatedTest(value = 40, name = "Square {currentRepetition}")
    @DisplayName("Test Square names")
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


        assertEquals(board.getSquareAt(i).getName(), name);

    }
    @Test
    void getanInexistantSquareShouldReturnNull(){

        assertNull(board.getSquareAt(42));
    }
}