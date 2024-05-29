import java.util.List;

public class ContactCard {
    public static void main(String[] args) {

        Card p1 = new Card("Ola", "Kowalska", "6543221", "Warszawa");
        Card p2 = new Card("Ala", "Nowak");
        BankCard p3 = new BankCard("Ola", "Kowalska", "6543221", "Warszawa", "100000009");

        // Creating two identical contact cards
        Card p4 = new Card("Ola", "Kowalska", "6543221", "Warszawa");
        Card p5 = new Card("Ola", "Kowalska", "6543221", "Warszawa");

        // Creating a wallet and adding cards
        Wallet wallet = new Wallet();
        wallet.addCard(p1);
        wallet.addCard(p2);
        wallet.addCard(p3);

        p1.getSurname();
        p1.getTel();
        p1.getAdress();
        p1.setName("Kasia");

        // Tests of function print from task 1-2

        // // Printing card with changed name from "Ola" to "Kasia"
        // p1.print();
        // // Printing card with original name "Ala"
        // p2.print();
        // // Printing business
        // p3.print();

        // Comparing the contact cards using ==
        System.out.println("Using == operator:");
        System.out.println("p4 == p5: " + (p4 == p5)); // Output: false (because p4 and p5 are different objects)
        System.out.println();

        // Comparing the contact cards using equals method
        System.out.println("Using equals method:");
        System.out.println("p4.equals(p5): " + p4.equals(p5)); // Output: true (because the equals method is overridden
                                                               // to compare the values)
        System.out.println();

        // Testing hashCode method
        System.out.println("Hash codes:");
        System.out.println("p4.hashCode(): " + p4.hashCode());
        System.out.println("p5.hashCode(): " + p5.hashCode());
        System.out.println();

        // Printing the contact card using println method
        System.out.println("Printing contact card using println method:");
        System.out.println(p1); // Output: prints the contact card without explicitly calling the print method
        System.out.println(p2); // Output: prints the contact card without explicitly calling the print method
        System.out.println(p3); // Output: prints the contact card without explicitly calling the print method

        // The three characteristics of a well-written equals method are:

        // Reflexivity: It must return true for two equal objects.
        // Symmetry: If a.equals(b) returns true, then b.equals(a) must also return
        // true.
        // Transitivity: If a.equals(b) returns true and b.equals(c) returns true, then
        // a.equals(c) must also return true.

        // Searching for cards by surname
        System.out.println("Searching for cards with surname 'Kowalska':");
        List<Card> kowalskaCards = wallet.findCardsBySurname("Kowalska");
        for (Card card : kowalskaCards) {
            System.out.println(card);
            System.out.println();
        }

        System.out.println("Searching for cards with surname 'Nowak':");
        List<Card> nowakCards = wallet.findCardsBySurname("Nowak");
        for (Card card : nowakCards) {
            System.out.println(card);
            System.out.println();
        }
    }
}
