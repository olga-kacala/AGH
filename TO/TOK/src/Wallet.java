import java.util.ArrayList;
import java.util.List;

class Wallet {
    private List<Card> cards;

    public Wallet() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> findCardsBySurname(String surname) {
        List<Card> result = new ArrayList<>();
        for (Card card : cards) {
            if (card.getSurname().equalsIgnoreCase(surname)) {
                result.add(card);
            }
        }
        return result;
    }
}
