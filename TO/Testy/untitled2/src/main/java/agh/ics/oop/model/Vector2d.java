package agh.ics.oop.model;
import java.lang.Object;


public class Vector2d {
    private int x;
    private int y;
    public Vector2d(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString(){
        return "(" + String.valueOf(x) + "," + String.valueOf(y) + ")";
    }

    public boolean precedes(Vector2d other){
        if(x <= other.x && y <= other.y) return true;
        return false;
    }
    public boolean follows(Vector2d other){
        if(x >= other.x && y >= other.y) return true;
        return false;
    }
    public Vector2d add(Vector2d other){
        return new Vector2d(x + other.x, y + other.y);
    }
    public Vector2d subtract(Vector2d other){
        return new Vector2d(x - other.x, y - other.y);
    }
    public Vector2d upperRight(Vector2d other){
        int newX = x;
        int newY = y;
        if(other.x > x) newX = other.x;
        if(other.y > y) newY = other.y;
        return new Vector2d(newX, newY);
    }

    public Vector2d lowerLeft(Vector2d other){
        int newX = x;
        int newY = y;
        if(other.x < x) newX = other.x;
        if(other.y < y) newY = other.y;
        return new Vector2d(newX, newY);
    }
    public Vector2d opposite(){
        return new Vector2d(-x, -y);
    }

//    public boolean equals(Object other){
//        if (this == other) return true;
//        if (!(other instanceof Vector2d)) return false;
//        Vector2d that = (Vector2d) other;
//        return x == that.x && y == that.y;
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2d vector2d = (Vector2d) o;
        return x == vector2d.x && y == vector2d.y;
    }

    public boolean insideBoundary(Vector2d start, Vector2d finish) {
        return (x >= start.getX() && x <= finish.getX() && y >= start.getY() && y <= finish.getY());
    }
}
