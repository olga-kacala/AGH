package agh.ics.oop.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MapDirectionTest {
    @Test
    void next() {
        assertEquals(MapDirection.EAST, MapDirection.next(MapDirection.NORTH));
        assertEquals(MapDirection.SOUTH, MapDirection.next(MapDirection.EAST));
        assertEquals(MapDirection.WEST, MapDirection.next(MapDirection.SOUTH));
        assertEquals(MapDirection.NORTH, MapDirection.next(MapDirection.WEST));
    }

    @Test
    void previous () {
        assertEquals(MapDirection.WEST, MapDirection.previous(MapDirection.NORTH));
        assertEquals(MapDirection.NORTH, MapDirection.previous(MapDirection.EAST));
        assertEquals(MapDirection.EAST, MapDirection.previous(MapDirection.SOUTH));
        assertEquals(MapDirection.SOUTH, MapDirection.previous(MapDirection.WEST));

    }

    @Test
    void toStringString () {
        assertEquals("Wschód", MapDirection.EAST.toString());
        assertEquals("Zachód", MapDirection.WEST.toString());
        assertEquals("Północ", MapDirection.NORTH.toString());
        assertEquals("Południe", MapDirection.SOUTH.toString());
    }


    @Test
    void toUnitVector () {
        assertEquals(new Vector2d(0,1), MapDirection.toUnitVector(MapDirection.NORTH));
        assertEquals(new Vector2d(0,-1), MapDirection.toUnitVector(MapDirection.SOUTH));
        assertEquals(new Vector2d(-1,0), MapDirection.toUnitVector(MapDirection.WEST));
        assertEquals(new Vector2d(1,0), MapDirection.toUnitVector(MapDirection.EAST));
    }

    @Test
    void toStringTest() {
        assertEquals("Północ", MapDirection.NORTH.toString());
        assertEquals("Południe", MapDirection.SOUTH.toString());
        assertEquals("Wschód", MapDirection.EAST.toString());
        assertEquals("Zachód", MapDirection.WEST.toString());
    }


}
