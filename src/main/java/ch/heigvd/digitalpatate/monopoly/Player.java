package ch.heigvd.digitalpatate.monopoly;

public class Player {

    private String name;
    private Die[] dices;
    private Board board;
    private Piece piece;



    public Player(String name, Die[] dices, Board board) {
        this.name = name;
        this.dices = dices;
        this.board = board;
        this.piece = new Piece(board.getSquareAt(0));

    }

    public void takeTurn() {

        int fvTotal=0;
        Square oldLocation=piece.getLocation();

        for (int i=0; i<dices.length;++i){
            dices[i].roll();
            fvTotal+=dices[i].getFaceValue();
        }

        System.out.println(name + " rolled: "+fvTotal);

        Square newLocation=board.getSquare(oldLocation,fvTotal);

        piece.setLocation(newLocation);

        System.out.println(name + " landed on: " + newLocation.getName());


    }
}
