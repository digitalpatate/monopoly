package ch.heigvd.digitalpatate.monopoly;

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