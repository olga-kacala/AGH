import wielokaty.Polygon;
import wielokaty.Triangle;
import wielokaty.Rectangle;
import wielokaty.Square;

public class Wielokaty {
    public static void main(String[] args) {
        Polygon triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle perimeter: " + triangle.perimeter());
        System.out.println("Triangle area: " + triangle.area());

        Polygon rectangle = new Rectangle(3, 4);
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle area: " + rectangle.area());

        Polygon square = new Square(3);
        System.out.println("Square perimeter: " + square.perimeter());
        System.out.println("Square area: " + square.area());
    }
}
