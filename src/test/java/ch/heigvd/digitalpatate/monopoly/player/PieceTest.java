package ch.heigvd.digitalpatate.monopoly.player;

import ch.heigvd.digitalpatate.monopoly.board.square.GoSquare;
import ch.heigvd.digitalpatate.monopoly.board.square.GoToJailSquare;
import ch.heigvd.digitalpatate.monopoly.board.square.Square;
import ch.heigvd.digitalpatate.monopoly.player.Piece;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    private Piece p;
    @BeforeEach
    void init(){
        this.p = new Piece(new GoSquare());
    }

    @Test
    void getLocationShouldNotBeNull() {
        assertNotNull(p.getLocation());
    }

    @Test
    void setLocation() {
        Square oldLocation = p.getLocation();
        p.setLocation(new GoToJailSquare());
        assertNotEquals(oldLocation,p.getLocation());
    }
}