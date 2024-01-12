import java.util.Arrays;
import java.util.Scanner;

public class Dividers {

    public static void main(String[] args) {
        int number = readNumber();
        int[] dividers = findDividers(number);
        printDividers(number, dividers);
    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter natural number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number. Enter natural number: ");
                scanner.next();
            }
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Invalid input. Enter positive number: ");
                scanner.next();
            }
        } while (number <= 0);
        return number;
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

    public static void printDividers(int number, int[] dividers) {
        int lenCount = dividers.length;
        System.out.println("Number " + number + " has " + lenCount + " dividers.");
        System.out.println("Dividers: ");
        for (int divider : dividers) {
            System.out.print(divider + ", ");
        }
    }

}