package agh.ics.oop.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    void constructorTest() {
        Animal animal = new Animal(new Vector2d(1, 1));
        assertEquals(new Vector2d(1, 1), animal.getPosition());
        assertEquals(MapDirection.NORTH, animal.getOrientation());

        Animal defaultAnimal = new Animal();
        assertEquals(new Vector2d(2, 2), defaultAnimal.getPosition());
        assertEquals(MapDirection.NORTH, defaultAnimal.getOrientation());
    }

    @Test
    void toStringTest() {
        Animal animal = new Animal(new Vector2d(1, 1));
        assertEquals("(1,1) Północ", animal.toString());
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
    void moveRightTest() {
        Animal animal = new Animal(new Vector2d(2, 2));
        animal.move(MoveDirection.RIGHT);
        assertEquals(MapDirection.EAST, animal.getOrientation());
    }

    @Test
    void moveLeftTest() {
        Animal animal = new Animal(new Vector2d(2, 2));
        animal.move(MoveDirection.LEFT);
        assertEquals(MapDirection.WEST, animal.getOrientation());
    }

    @Test
    void moveForwardWithinBoundsTest() {
        Animal animal = new Animal(new Vector2d(2, 2));

        animal.move(MoveDirection.FORWARD);
        assertEquals("(2,3) Północ", animal.toString());

        animal.move(MoveDirection.RIGHT); // Face east
        animal.move(MoveDirection.FORWARD);
        assertEquals("(3,3) Wschód", animal.toString());

        animal.move(MoveDirection.RIGHT); // Face south
        animal.move(MoveDirection.FORWARD);
        assertEquals("(3,2) Południe", animal.toString());

        animal.move(MoveDirection.RIGHT); // Face west
        animal.move(MoveDirection.FORWARD);
        assertEquals("(2,2) Zachód", animal.toString());
    }

    @Test
    void moveBackwardWithinBoundsTest() {
        Animal animal = new Animal(new Vector2d(2, 2));

        animal.move(MoveDirection.BACKWARD);
        assertEquals("(2,1) Północ", animal.toString());

        animal.move(MoveDirection.LEFT); // Face west
        animal.move(MoveDirection.BACKWARD);
        assertEquals("(3,1) Zachód", animal.toString());

        animal.move(MoveDirection.LEFT); // Face south
        animal.move(MoveDirection.BACKWARD);
        assertEquals("(3,2) Południe", animal.toString());

        animal.move(MoveDirection.LEFT); // Face east
        animal.move(MoveDirection.BACKWARD);
        assertEquals("(2,2) Wschód", animal.toString());

        // Additional test: move backward to stay within bounds
        animal.move(MoveDirection.BACKWARD);
        assertEquals("(1,2) Wschód", animal.toString());
    }


    @Test
    void moveForwardToEdgeTest() {
        Animal animal = new Animal(new Vector2d(4, 4));
        animal.move(MoveDirection.FORWARD);
        assertEquals("(4,4) Północ", animal.toString());
    }

    @Test
    void moveBackwardToEdgeTest() {
        Animal animal = new Animal(new Vector2d(0, 0));
        animal.move(MoveDirection.BACKWARD);
        assertEquals("(0,0) Północ", animal.toString());
    }

    @Test
    void moveForwardOutOfBoundsTest() {
        Animal animal = new Animal(new Vector2d(4, 4));
        animal.move(MoveDirection.RIGHT); // Face east
        animal.move(MoveDirection.FORWARD);
        animal.move(MoveDirection.FORWARD); // Attempt to move out of bounds
        assertEquals("(4,4) Wschód", animal.toString());
    }

    @Test
    void moveBackwardOutOfBoundsTest() {
        Animal animal = new Animal(new Vector2d(0, 0));
        animal.move(MoveDirection.LEFT); // Face west
        animal.move(MoveDirection.BACKWARD);
        animal.move(MoveDirection.BACKWARD); // Attempt to move out of bounds
        assertEquals("(2,0) Zachód", animal.toString());
    }

    @Test
    void moveAroundMapTest() {
        Animal animal = new Animal(new Vector2d(2, 2));

        // Move in a square pattern around the map
        animal.move(MoveDirection.FORWARD); // (2, 3) NORTH
        animal.move(MoveDirection.RIGHT); // EAST
        animal.move(MoveDirection.FORWARD); // (3, 3) EAST
        animal.move(MoveDirection.RIGHT); // SOUTH
        animal.move(MoveDirection.FORWARD); // (3, 2) SOUTH
        animal.move(MoveDirection.RIGHT); // WEST
        animal.move(MoveDirection.FORWARD); // (2, 2) WEST
        animal.move(MoveDirection.RIGHT); // NORTH again

        assertEquals("(2,2) Północ", animal.toString());
    }
}
