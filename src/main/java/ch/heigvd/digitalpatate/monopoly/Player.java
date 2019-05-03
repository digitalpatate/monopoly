package ch.heigvd.digitalpatate.monopoly;

public class Player {

    private String name;
    private Cup cup;
    private Board board;
    private Piece piece;
    private int cash;


    public Player(String name, Cup cup, Board board) {
        this.name = name;
        this.cup=cup;
        this.board = board;
        this.piece = new Piece(board.getSquareAt(0));
        this.cash = 1500;

    }

    public void takeTurn() {
        Square oldLocation = piece.getLocation();

        cup.roll();
        int fvTotal = cup.getTotal();

        System.out.println(name + " rolled: " + fvTotal);

        Square newLocation = board.getSquare(oldLocation, fvTotal);

        piece.setLocation(newLocation);

        newLocation.landedOn(this);

        System.out.println(name + " landed on: " + newLocation.getName());


    }

    public void addCash(int amount) {

        if(amount <0 ){
            throw new IllegalArgumentException("Amount should be positive");
        }
        cash += amount;
    }

    public int getNetWorth(){

        return cash;
    }

    public void reduceCash(int amount){

        if(amount <0 ){
            throw new IllegalArgumentException("Amount should be positive");
        }
        if((cash - amount)<0){
            throw new RuntimeException("Amount should be positive");
        }
        cash-=amount;
    }

    public Piece getPiece() {
        return piece;
    }
}
