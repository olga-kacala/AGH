package wielokaty;

public abstract class Polygon {
    protected double[] sides;

    public Polygon(double[] sides) {
        this.sides = sides;
    }

    public abstract double perimeter();

    public abstract double area();
}
