import java.util.Scanner;

public class Dividers {

    public static void main(String[] args) {
        int number = readNumber();

    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls give number: ");
        return scanner.nextInt();

    }

}