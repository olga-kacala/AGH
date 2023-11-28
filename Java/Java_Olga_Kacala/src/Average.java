import java.util.Scanner;

public class Average {

    public static double average(int[] marks) {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum / (double) marks.length;
    }

    public static int findMax(int[] marks) {
        if (marks.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }

        return max;
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

        int maxMark = findMax(marksArray);
        System.out.println("Najwyższa ocena ucznia: " + maxMark);
    }

}
