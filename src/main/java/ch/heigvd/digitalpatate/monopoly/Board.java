package ch.heigvd.digitalpatate.monopoly;

public class Board {

    private Square[] squares;

    public Board() {

        squares = new Square[40];

        squares[0] = new GoSquare();
        for (int i = 1; i < squares.length; ++i) {
            squares[i] = new RegularSquare("Square " + i,i);
        }
        squares[10]=new GoToJailSquare();
        squares[30]=new RegularSquare("jail",30);
        squares[2]=new IncomeTaxSquare(2);
        squares[38]=new IncomeTaxSquare(38);


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
