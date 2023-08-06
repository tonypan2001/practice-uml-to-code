package game;

import java.util.List;

public class MGame {
    private int roundCnt;
    private List<Player> players;
    private Board board;
    int n;

    public MGame(List<Player> players, Board board, int n, List<Die> dice) {
        this.players = players;
        this.board = board;
        this.n = n;
    }
    public void playGame() {
        while (roundCnt < n) {
            System.out.println("ROUND:" + roundCnt);
            playRound();
            roundCnt++;
        }
    }

    private void playRound() {
        for (Player player : players) {
            player.takeTurn();
        }
    }
}
