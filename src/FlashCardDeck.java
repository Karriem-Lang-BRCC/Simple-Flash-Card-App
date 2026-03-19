// FlashCardDecck.java
// This class represents a collection (a "deck") of FlashCard objects.
// It stores the cards internally and provides methods to work with them.

import java.util.ArrayList;
import java.util.List;

public class FlashCardDeck {

    // This list (interface/flexibility) holds all the FlashCard objects.
    // We keep it private to protect it (encapsulation).
    private List<FlashCard> cards;

    // Constructor: creates an empty deck.
    public FlashCardDeck() {
        cards = new ArrayList<>();
    }

    // Adds a new FlashCard to the deck.
    public void addCard(FlashCard card) {
        cards.add(card);
    }

    // Removes a FlashCard from the deck.
    public void removeCard(FlashCard card) {
        cards.remove(card);
    }

    // Returns a FlashCard at a specific position.
    public FlashCard getCard(int index) {
        return cards.get(index);
    }

    // Returns how many cards are in the deck.
    public int size() {
        return cards.size();
    }
}
