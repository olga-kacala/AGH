package wielokaty;

public class Triangle extends Polygon {
    public Triangle(double side1, double side2, double side3) {
        super(new double[] { side1, side2, side3 });
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
    }

    @Override
    public double perimeter() {
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return sum;
    }

    @Override
    public double area() {
        double a = sides[0], b = sides[1], c = sides[2];
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
