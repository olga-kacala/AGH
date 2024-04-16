public class Main {

    public static int NWD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int NWW(int a, int b) {
        return a * b / (NWD(a, b));
    }

    public static void main(String[] args) {
        int num1 = 112;
        int num2 = 42;

        System.out.println(
                "Najwieksza wspolna wielotrotnosc dla liczb " + num1 + " i " + num2 + " to: " + NWW(num1, num2));

    }
}
