package ch.heigvd.digitalpatate.monopoly.board;


import ch.heigvd.digitalpatate.monopoly.board.square.*;

public class Board {

    private Square[] squares;

    public Board() {

        squares = new Square[40];

        squares[0] = new GoSquare();
        for (int i = 1; i < squares.length; ++i) {
            squares[i] = new RegularSquare("Square " + i,i);
        }
        squares[10]=new GoToJailSquare();
        squares[30]=new RegularSquare("Jail",30);
        squares[2]=new IncomeTaxSquare(2);
        squares[38]=new IncomeTaxSquare(38);


    }



    public Square getSquare(Square oldLocation, int index) {

        if (index < 0 || index >= squares.length) {
            return null;
        }

        return squares[(oldLocation.getIndex()+index) % 40];
    }

    public Square getSquareAt(int index){
        if (index < 0 || index >= squares.length) {
            return null;
        }

        return squares[index];
    }


}
