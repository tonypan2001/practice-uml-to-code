package game;

import java.util.List;

public class Board {
    private List<Square> squares;

    public Board(List<Square> squareList) {
        this.squares = squareList;
    }

    public Square getSquare(Square oldLoc, int faceValueTotal) {
        int maxIndex = squares.size()-1;
        int newIndex = squares.indexOf(oldLoc) + faceValueTotal;
        if (newIndex > maxIndex) {
            return squares.get(newIndex - maxIndex);
        }
        return squares.get(newIndex);
    }
}
