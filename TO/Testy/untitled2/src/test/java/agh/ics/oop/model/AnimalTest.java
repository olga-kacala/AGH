package agh.ics.oop.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    void toStringTest() {
        Animal animal = new Animal(new Vector2d(1, 1));
        assertEquals("(1,1) Północ", animal.toString());
    }

    @Test
    void moveMultipleTest() {
        Animal animal = new Animal(new Vector2d(2, 2));
        animal.move(MoveDirection.RIGHT);
        assertEquals("(2,2) Wschód", animal.toString());

        animal.move(MoveDirection.FORWARD);
        assertEquals("(3,2) Wschód", animal.toString());

        animal.move(MoveDirection.BACKWARD);
        assertEquals("(2,2) Wschód", animal.toString());

        animal.move(MoveDirection.LEFT);
        assertEquals("(2,2) Północ", animal.toString());

        animal.move(MoveDirection.FORWARD);
        assertEquals("(2,3) Północ", animal.toString());
    }

    @Test
    void moveToEdgesTest() {
        Animal animal = new Animal();
        animal.move(MoveDirection.FORWARD);
        assertEquals("(2,3) Północ", animal.toString());

        animal.move(MoveDirection.LEFT);
        animal.move(MoveDirection.FORWARD);
        assertEquals("(1,3) Zachód", animal.toString());

        animal.move(MoveDirection.LEFT);
        animal.move(MoveDirection.FORWARD);
        assertEquals("(1,2) Południe", animal.toString());

        animal.move(MoveDirection.LEFT);
        animal.move(MoveDirection.FORWARD);
        assertEquals("(2,2) Wschód", animal.toString());

        animal.move(MoveDirection.RIGHT);
        animal.move(MoveDirection.FORWARD);
        assertEquals("(2,1) Południe", animal.toString());
    }

    @Test
    void getPositionTest() {
        Animal animal = new Animal(new Vector2d(3, 3));
        assertEquals(new Vector2d(3, 3), animal.getPosition());
    }

    @Test
    void getOrientationTest() {
        Animal animal = new Animal(new Vector2d(3, 3));
        assertEquals(MapDirection.NORTH, animal.getOrientation());
    }

    @Test
    void isAtTest() {
        Animal animal = new Animal(new Vector2d(3, 3));
        assertTrue(animal.isAt(new Vector2d(3, 3)));
        assertFalse(animal.isAt(new Vector2d(2, 2)));
    }

    @Test
    void moveBackwardWithinBoundsTest() {
        // Create an animal in the middle of the map facing west
        Animal animal = new Animal(new Vector2d(2, 2));

        // Test moving backward when within bounds
        animal.move(MoveDirection.LEFT); // Face north
        animal.move(MoveDirection.BACKWARD);
        assertEquals("(3,2) Zachód", animal.toString());
    }

    @Test
    void moveBackwardToEdgeTest() {
        // Create an animal at the edge of the map facing south
        Animal animal = new Animal(new Vector2d(0, 0));
        animal.move(MoveDirection.RIGHT); // Rotate to face south

        // Test moving backward when at the edge of the map
        animal.move(MoveDirection.BACKWARD);
        assertEquals("(0,0) Wschód", animal.toString());
    }

    @Test
    void moveBackwardOutOfBoundsTest() {
        // Create an animal at the edge of the map facing west
        Animal animal = new Animal(new Vector2d(0, 0));
        animal.move(MoveDirection.LEFT); // Rotate to face west

        // Test moving backward when already at the edge of the map
        animal.move(MoveDirection.BACKWARD);
        assertEquals("(1,0) Zachód", animal.toString());
    }

    @Test
    void moveForwardWithinBoundsTest() {
        // Create an animal in the middle of the map facing east
        Animal animal = new Animal(new Vector2d(2, 2));

        // Test moving forward when within bounds
        animal.move(MoveDirection.RIGHT); // Face south
        animal.move(MoveDirection.FORWARD);
        assertEquals("(3,2) Wschód", animal.toString());
    }


    @Test
    void moveForwardToEdgeTest() {
        // Create an animal at the edge of the map facing north
        Animal animal = new Animal(new Vector2d(4, 4));

        // Test moving forward when at the edge of the map
        animal.move(MoveDirection.FORWARD);
        assertEquals("(4,4) Północ", animal.toString());
    }

    @Test
    void moveForwardOutOfBoundsTest() {
        // Create an animal at the edge of the map facing east
        Animal animal = new Animal(new Vector2d(4, 0));
        animal.move(MoveDirection.LEFT); // Rotate to face east

        // Test moving forward when already at the edge of the map
        animal.move(MoveDirection.FORWARD);
        assertEquals("(3,0) Zachód", animal.toString());
    }

    @Test
    void moveForwardAndBackwardSamePositionTest() {
        // Create an animal in the middle of the map facing north
        Animal animal = new Animal(new Vector2d(2, 2));

        // Test moving forward and then backward to same position
        animal.move(MoveDirection.FORWARD);
        assertEquals("(2,3) Północ", animal.toString());
        animal.move(MoveDirection.BACKWARD);
        assertEquals("(2,2) Północ", animal.toString());
    }

    @Test
    void moveLeftAndRightSameOrientationTest() {
        // Create an animal in the middle of the map facing east
        Animal animal = new Animal(new Vector2d(2, 2));

        // Test moving left and then right to same orientation
        animal.move(MoveDirection.LEFT);
        assertEquals("(2,2) Zachód", animal.toString());
        animal.move(MoveDirection.RIGHT);
        assertEquals("(2,2) Północ", animal.toString());
    }
    @Test
    void moveForwardToEdgeBoundaryTest() {
        // Create an animal at the edge of the map facing north
        Animal animal = new Animal(new Vector2d(4, 4));
        animal.move(MoveDirection.FORWARD);
        assertEquals("(4,4) Północ", animal.toString());
    }
    @Test
    void moveBackwardToEdgeBoundaryTest() {
        // Create an animal at the edge of the map facing south
        Animal animal = new Animal(new Vector2d(0, 0));
        animal.move(MoveDirection.BACKWARD);
        assertEquals("(0,0) Północ", animal.toString());
    }


}