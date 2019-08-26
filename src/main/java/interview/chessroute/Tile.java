package interview.chessroute;

import java.util.Objects;

public class Tile {
    final int row;
    final int col;

    Tile(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return row == tile.row &&
                col == tile.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }

    @Override
    public String toString() {
        return "Tile{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
