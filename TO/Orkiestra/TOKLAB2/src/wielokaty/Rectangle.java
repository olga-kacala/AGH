package wielokaty;

public class Rectangle extends Polygon {
    public Rectangle(double width, double height) {
        super(new double[] { width, height, width, height });
    }

    @Override
    public double perimeter() {
        return 2 * (sides[0] + sides[1]);
    }

    @Override
    public double area() {
        return sides[0] * sides[1];
    }
}
