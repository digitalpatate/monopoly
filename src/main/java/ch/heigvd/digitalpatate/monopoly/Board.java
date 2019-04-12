package ch.heigvd.digitalpatate.monopoly;

public class Board {

    private Square[] squares;

    public Board() {

        squares = new Square[40];

        squares[0] = new Square("Go");
        for (int i = 1; i < squares.length; ++i) {
            squares[i] = new Square("Square" + i);
        }
    }

    Square getSquare(int index) {

        if (index < 0 || index >= squares.length) {
            return null;
        }

        return squares[index];
    }
}
