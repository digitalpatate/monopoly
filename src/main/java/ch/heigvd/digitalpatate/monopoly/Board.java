package ch.heigvd.digitalpatate.monopoly;

public class Board {

    private Square[] squares;

    public Board() {

        squares = new Square[40];

        squares[0] = new Square("Go",0);
        for (int i = 1; i < squares.length; ++i) {
            squares[i] = new Square("Square " + i,i);
        }
    }



    Square getSquare(Square oldLocation ,int index) {

        if (index < 0 || index >= squares.length) {
            return null;
        }

        return squares[(oldLocation.getIndex()+index) % 40];
    }

    Square getSquareAt(int index){
        if (index < 0 || index >= squares.length) {
            return null;
        }

        return squares[index];
    }


}
