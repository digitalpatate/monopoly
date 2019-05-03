package ch.heigvd.digitalpatate.monopoly;

import ch.heigvd.digitalpatate.monopoly.board.Board;
import ch.heigvd.digitalpatate.monopoly.cup.Cup;
import ch.heigvd.digitalpatate.monopoly.cup.Die;
import ch.heigvd.digitalpatate.monopoly.player.Player;

public class MGame {

    private static final int MIN_PLAYER = 2;
    private static final int MAX_PLAYER = 8;
    private static final int ROUND_COUNT=20;
    private static final int DIE_FACE_COUNT=6;


    private int roundCount;

    private Board board;
    //private Die[] dices;
    private Cup cup;
    private Player[] players;

    public MGame(int playerCount) throws IllegalArgumentException {

        if (playerCount < MIN_PLAYER || playerCount > MAX_PLAYER) {
            throw new IllegalArgumentException("Player count should be between " + MIN_PLAYER + " and " + MAX_PLAYER);
        }

        roundCount = 0;

        board = new Board();

        cup = new Cup(new Die(DIE_FACE_COUNT), new Die(DIE_FACE_COUNT));


        players = new Player[playerCount];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player " + (i + 1), cup, board);
        }
    }

    public void playGame() {


        while (roundCount<ROUND_COUNT){
            playRound();
        }


    }

    private void playRound() {

            for(int i =0; i<players.length; ++i){

                players[i].takeTurn();
                System.out.println("--------");
            }

        roundCount++;
    }

    public Player[] getPlayers() {
        return players;
    }

    public static void main(String[] args) {

        MGame mGame = new MGame(2);

        mGame.playGame();






    }
}
