package interview.chessroute;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testInitBoard() {
        for (int i = 0; i < 5; i++) {
            assertEquals(i * i, App.initBoard(i).size());
        }
        assertEquals(
                ImmutableSet.of(new Tile(0, 0)),
                App.initBoard(1));
        assertEquals(
                ImmutableSet.of(new Tile(0, 0),
                        new Tile(0, 1),
                        new Tile(1, 0),
                        new Tile(1, 1)),
                App.initBoard(2));
    }
}
