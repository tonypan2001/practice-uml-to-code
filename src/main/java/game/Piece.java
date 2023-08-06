package game;

import java.util.ArrayList;
import java.util.List;

public class Piece {
    private List<Piece> pieces = new ArrayList<>();
    private Square location;

    public Piece(Square location) {
        this.location = location;
        pieces.add(this);
    }
    public Square getLocation() {
        return location;
    }
    public void setLocation(Square newLocation) {
        this.location = newLocation;
    }
}
