package game;

import java.util.List;

public class Player {
    private Piece piece;
    private String name;
    private List<Die> dieList;
    private Board board;

    public Player(Piece piece, String name, List<Die> dieList, Board board) {
        this.piece = piece;
        this.name = name;
        this.dieList = dieList;
        this.board = board;
    }

    public void takeTurn() {
        int faceValue = 0;
        for (Die die : dieList) {
            die.roll();
            faceValue += die.getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, faceValue);
        piece.setLocation(newLoc);
    }
}
