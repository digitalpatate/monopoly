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
        this.piece = new Piece(board.getSquare(0));
    }

    public void takeTurn() {

    }
}
