import java.util.Scanner;
import java.util.Arrays;

public class Dividers {

    public static void main(String[] args) {
        int number = readNumber();
        int[] dividers = findDividers(number);
        printDividers(dividers);
    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number: ");
        return scanner.nextInt();
    }

    public static boolean checkDividers(int a, int b) {
        return a % b == 0;
    }

    public static int[] findDividers(int x) {
        int dividers[] = new int[x / 2 + 1];
        int count = 0;

        for (int i = 1; i <= x / 2; i++) {
            if (checkDividers(x, i)) {
                dividers[count] = i;
                count++;
            }
        }
        dividers[count] = x;
        count++;
        return Arrays.copyOf(dividers, count);
    }

    public static void printDividers(int[] dividers) {
        System.out.println("Dividers: ");
        for (int divider : dividers) {
            System.out.print(divider + ", ");
        }
    }

}