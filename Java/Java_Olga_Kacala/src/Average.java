import java.util.Scanner;

public class Average {

    public static double average(int[] marks) {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum / (double) marks.length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość ocen ucznia:");
        int marksAmount = scanner.nextInt();
        scanner.nextLine();

        int[] marksArray = new int[marksAmount];

        System.out.println("Podaj oceny:");

        for (int i = 0; i < marksAmount; i++) {
            marksArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        double result = average(marksArray);
        System.out.println("Śrenia z ocen ucznia: " + result);
        scanner.close();
    }

}
