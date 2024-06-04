package agh.ics.oop.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Vector2dTest {
    Vector2d p0 = new Vector2d(0, 0);
    Vector2d p1 = new Vector2d(10, 7);
    Vector2d p2 = new Vector2d(2, 7);
    Vector2d p3 = new Vector2d(10, 3);

    @Test
    void precedesTest() {
        assertTrue(p0.precedes(p1));
        assertTrue(p0.precedes(p2));
        assertTrue(p0.precedes(p3));
        assertTrue(p0.precedes(p0));
        assertFalse(p1.precedes(p0));
        assertFalse(p2.precedes(p3));
        assertFalse(p3.precedes(p2));
        assertFalse(p1.precedes(p2));
    }

    @Test
    void follows() {
        assertFalse(p0.follows(p2));
        assertFalse(p0.follows(p1));
        assertFalse(p0.follows(p3));
        assertTrue(p0.follows(p0));
        assertTrue(p1.follows(p0));
        assertFalse(p2.follows(p3));
        assertFalse(p3.follows(p2));
        assertTrue(p1.follows(p2));
    }

    @Test
    void getX() {
        assertEquals(0, p0.getX());
    }

    @Test
    void getY() {
        assertEquals(0, p0.getY());
    }

    @Test
    void toStringString () {
        assertEquals("(0,0)", p0.toString());
    }

    @Test
    void add() {
assertEquals(new Vector2d(2,7),p0.add(p2));

    }

    @Test
    void subtract() {
        assertEquals(new Vector2d(-2,-7),p0.subtract(p2));
    }

    @Test
    void upperRight() {
        assertEquals(new Vector2d(2,7),p0.upperRight(p2));
    }

    @Test
    void lowerLeft() {
        assertEquals(new Vector2d(0,0),p0.lowerLeft(p2));
    }

    @Test
    void opposite() {
        assertEquals(new Vector2d(-10,-7),p1.opposite());
    }

    @Test
    void insideBoundary() {
        Vector2d v1 = new Vector2d(0,0);
        Vector2d v2 = new Vector2d(5,5);

        Vector2d in = new Vector2d(1,3);
        Vector2d out = new Vector2d(1,7);
        assertFalse(out.insideBoundary(v1,v2));
        assertTrue(in.insideBoundary(v1,v2));

        Vector2d borderX = new Vector2d(0, 5);
        Vector2d borderY = new Vector2d(5, 0);
        Vector2d corner = new Vector2d(5, 5);

        assertTrue(borderX.insideBoundary(v1, v2));
        assertTrue(borderY.insideBoundary(v1, v2));
        assertTrue(corner.insideBoundary(v1, v2));
    }
    @Test
    void equals() {
        Vector2d v1 = new Vector2d(3, 4);
        Vector2d v2 = new Vector2d(3, 4);
        Vector2d v3 = new Vector2d(5, 6);

        assertTrue(v1.equals(v2));
        assertTrue(v2.equals(v1));
        assertFalse(v1.equals(v3));
        assertFalse(v3.equals(v1));
        assertFalse(v2.equals(v3));
        assertFalse(v3.equals(v2));
    }

    @Test
    void equalsTest() {
        Vector2d v1 = new Vector2d(3, 4);
        Vector2d v2 = new Vector2d(3, 4);
        Vector2d v3 = new Vector2d(5, 6);
        Vector2d v4 = new Vector2d(3, 5);
        Object obj = new Object();

        assertTrue(v1.equals(v2)); // True branch: x == vector2d.x && y == vector2d.y
        assertFalse(v1.equals(v3)); // False branch: x != vector2d.x || y != vector2d.y
        assertFalse(v1.equals(obj)); // False branch: obj is not an instance of Vector2d
        assertTrue(v1.equals(v1)); // True branch: this == obj
        assertFalse(v1.equals(null)); // False branch: obj is null

        assertTrue(v2.equals(v1)); // True branch: x == vector2d.x && y == vector2d.y
        assertFalse(v3.equals(v1)); // False branch: x != vector2d.x || y != vector2d.y
        assertFalse(v2.equals(v3)); // False branch: x != vector2d.x || y != vector2d.y
        assertFalse(v3.equals(v2)); // False branch: x != vector2d.x || y != vector2d.y
        assertFalse(v2.equals(v4)); // False branch: y != vector2d.y
    }
    @Test
    void equalsNullObjectTest() {
        Vector2d v1 = new Vector2d(3, 4);

        assertFalse(v1.equals(null)); // False branch
    }
    @Test
    void upperRightTest() {
        Vector2d v1 = new Vector2d(3, 4);
        Vector2d v2 = new Vector2d(5, 6);
        Vector2d v3 = new Vector2d(1, 2);

        assertEquals(new Vector2d(5, 6), v1.upperRight(v2)); // Both conditions are true
        assertEquals(new Vector2d(3, 4), v1.upperRight(v3)); // Only the first condition is true
        assertEquals(new Vector2d(5, 6), v2.upperRight(v3)); // Only the second condition is true
    }


    @Test
    void lowerLeftTest() {
        Vector2d v1 = new Vector2d(3, 4);
        Vector2d v2 = new Vector2d(5, 6);
        Vector2d v3 = new Vector2d(1, 2);

        assertEquals(new Vector2d(3, 4), v1.lowerLeft(v2)); // Both conditions are false
        assertEquals(new Vector2d(1, 2), v1.lowerLeft(v3)); // Only the first condition is true
        assertEquals(new Vector2d(1, 2), v2.lowerLeft(v3)); // Only the second condition is true
    }


    @Test
    void insideBoundaryTest() {
        Vector2d start = new Vector2d(0, 0);
        Vector2d finish = new Vector2d(5, 5);

        // Test point inside the boundary
        Vector2d inside = new Vector2d(3, 3);
        assertTrue(inside.insideBoundary(start, finish));

        // Test points on the boundary edges
        Vector2d onBoundaryXStart = new Vector2d(0, 3);
        Vector2d onBoundaryXFinish = new Vector2d(5, 3);
        Vector2d onBoundaryYStart = new Vector2d(3, 0);
        Vector2d onBoundaryYFinish = new Vector2d(3, 5);

        assertTrue(onBoundaryXStart.insideBoundary(start, finish));
        assertTrue(onBoundaryXFinish.insideBoundary(start, finish));
        assertTrue(onBoundaryYStart.insideBoundary(start, finish));
        assertTrue(onBoundaryYFinish.insideBoundary(start, finish));

        // Test points outside the boundary
        Vector2d outsideX = new Vector2d(6, 3);
        Vector2d outsideY = new Vector2d(3, 6);
        Vector2d outsideBoth = new Vector2d(6, 6);

        assertFalse(outsideX.insideBoundary(start, finish));
        assertFalse(outsideY.insideBoundary(start, finish));
        assertFalse(outsideBoth.insideBoundary(start, finish));

        // Test points on the boundary corners
        Vector2d corner1 = new Vector2d(0, 0);
        Vector2d corner2 = new Vector2d(5, 0);
        Vector2d corner3 = new Vector2d(0, 5);
        Vector2d corner4 = new Vector2d(5, 5);

        assertTrue(corner1.insideBoundary(start, finish));
        assertTrue(corner2.insideBoundary(start, finish));
        assertTrue(corner3.insideBoundary(start, finish));
        assertTrue(corner4.insideBoundary(start, finish));

        // Additional edge cases
        Vector2d negativeX = new Vector2d(-1, 3);
        Vector2d negativeY = new Vector2d(3, -1);
        Vector2d negativeBoth = new Vector2d(-1, -1);

        assertFalse(negativeX.insideBoundary(start, finish));
        assertFalse(negativeY.insideBoundary(start, finish));
        assertFalse(negativeBoth.insideBoundary(start, finish));
        // Zero boundary test cases
        Vector2d zeroStart = new Vector2d(0, 0);
        Vector2d zeroFinishX = new Vector2d(0, 3);
        Vector2d zeroFinishY = new Vector2d(3, 0);

        assertTrue(zeroStart.insideBoundary(start, finish));
        assertTrue(zeroFinishX.insideBoundary(start, finish));
        assertTrue(zeroFinishY.insideBoundary(start, finish));
    }
}
