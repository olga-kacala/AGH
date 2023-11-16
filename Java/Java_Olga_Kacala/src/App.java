import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Enter your tel number (no white spaces): ");
        long tel = scanner.nextLong();

        scanner.nextLine();

        System.out.println("Enter your city: ");
        String city = scanner.nextLine();

        String frame = "";
        String topWhiteSpace = "";
        String bottomWhiteSpace = "";

        String topSentence = "* " + name + " " + surname + " ";
        String bottomSentence = "* tel. " + tel + " adres: " + city + " ";

        if (topSentence.length() > bottomSentence.length()) {
            for (int i = 0; i <= topSentence.length(); i++) {
                frame += "*";
            }
            for (int j = bottomSentence.length(); j < topSentence.length(); j++) {
                bottomWhiteSpace += " ";
            }
        } else {
            for (int i = 0; i <= bottomSentence.length(); i++) {
                frame += "*";
            }
            for (int j = topSentence.length(); j < bottomSentence.length(); j++) {
                topWhiteSpace += " ";
            }
        }
        System.out.println(frame);
        System.out.println(topSentence + topWhiteSpace + "*");
        System.out.println(bottomSentence + bottomWhiteSpace + "*");
        System.out.println(frame);

        scanner.close();
    }
}
