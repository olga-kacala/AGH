public class Trojkat {
    public static void main(String[] args) {
        int a = 5;
        int h = 3;

        double triangle = (double) a * h / 2;

        if (triangle > 7) {
            System.out.println("Duzy trojkat");
        } else {
            System.out.println("Maly trojkat");
        }
        System.out.println(triangle);
    }
}