package agh.ics.oop.model;

public class Animal {
    private MapDirection orientation = MapDirection.NORTH;
    private Vector2d position;

    public Animal(Vector2d location) {
        this.position = location;
        this.orientation = MapDirection.NORTH;
    }

    public Animal() {
        this(new Vector2d(2, 2));
    }

    public Vector2d getPosition() {
        return position;
    }

    public MapDirection getOrientation() {
        return orientation;
    }

    public String toString() {
        return position.toString() + " " + orientation.toString();
    }

    public boolean isAt(Vector2d position) {
        return this.position.equals(position);
    }

    public void move(MoveDirection direction) {
        switch (direction) {
            case RIGHT:
                orientation = MapDirection.next(orientation);
                break;
            case LEFT:
                orientation = MapDirection.previous(orientation);
                break;
            case FORWARD:
                Vector2d to_add = MapDirection.toUnitVector(orientation);
                if (position.add(to_add).getX() <= 4 && position.add(to_add).getY() <= 4
                        && position.add(to_add).getX() >= 0 && position.add(to_add).getY() >= 0) {
                    position = position.add(to_add);
                }
                break;
            case BACKWARD:
                Vector2d to_sub = MapDirection.toUnitVector(orientation);
                if (position.subtract(to_sub).getX() <= 4 && position.subtract(to_sub).getY() <= 4
                        && position.subtract(to_sub).getX() >= 0 && position.subtract(to_sub).getY() >= 0) {
                    position = position.subtract(to_sub);
                }
                break;
        }
    }




}