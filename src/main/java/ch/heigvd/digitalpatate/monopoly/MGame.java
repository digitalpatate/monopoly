package ch.heigvd.digitalpatate.monopoly;

public class MGame {

    private int roundCount;

    private Board board;
    private Die[] dices;
    private Player[] players;

    public MGame(int playerCount) {

        roundCount = 0;

        board = new Board();

        dices = new Die[] {
                new Die(6), new Die(6)
        };

        players = new Player[playerCount];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player" + (i + 1), dices, board);
        }
    }

    public void playGame() {

    }

    private void playRound() {

    }

    public static void main(String[] args) {
        new MGame(4);
    }
}
