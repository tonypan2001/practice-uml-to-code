package game;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Square> squares = new ArrayList<>();
        for (int i = 1; i <= 40; i++) {
            squares.add(new Square(String.valueOf(i)));
        }
        Board board = new Board(squares);

        List<Die> dieList = new ArrayList<>();
        dieList.add(new Die());
        dieList.add(new Die());

        List<Player> players = new ArrayList<>();
        players.add(new Player(new Piece(squares.get(0)), "A", dieList, board));
        players.add(new Player(new Piece(squares.get(0)), "B", dieList, board));
        players.add(new Player(new Piece(squares.get(0)), "C", dieList, board));

        MGame mGame = new MGame(players, board, 10, dieList);
        mGame.playGame();
    }
}