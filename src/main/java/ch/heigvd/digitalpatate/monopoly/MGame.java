package ch.heigvd.digitalpatate.monopoly;

public class MGame {

    private static final int MIN_PLAYER = 2;
    private static final int MAX_PLAYER = 8;

    private int roundCount;

    private Board board;
    private Die[] dices;
    private Player[] players;

    public MGame(int playerCount) throws IllegalArgumentException {

        if (playerCount < MIN_PLAYER || playerCount > MAX_PLAYER) {
            throw new IllegalArgumentException("Player count should be between " + MIN_PLAYER + " and " + MAX_PLAYER);
        }

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

    public Player[] getPlayers() {
        return players;
    }

    public static void main(String[] args) {

        MGame mGame = new MGame(1);
    }
}
