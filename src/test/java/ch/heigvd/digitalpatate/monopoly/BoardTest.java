package ch.heigvd.digitalpatate.monopoly;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void theFirstSquareIsNamedGo() {

        String name = "Go";

        Board board = new Board();

        assertEquals(board.getSquare(0).getName(), name);
    }

    @RepeatedTest(value = 39, name = "Square {currentRepetition}")
    void otherSquaresAreNamedSquareID(RepetitionInfo repetitionInfo) {

        String name = "Square" + repetitionInfo.getCurrentRepetition();

        Board board = new Board();

        assertEquals(board.getSquare(repetitionInfo.getCurrentRepetition()).getName(), name);
    }
}