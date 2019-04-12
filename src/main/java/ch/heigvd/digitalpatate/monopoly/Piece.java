package ch.heigvd.digitalpatate.monopoly;

public class Piece {

    private Square location;

    public Piece(Square location) {
        this.location = location;
    }

    public Square getLocation() {
        return location;
    }
}
