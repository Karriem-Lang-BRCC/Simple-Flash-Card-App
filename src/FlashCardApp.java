// FlashCardApp.java
// This is where the magic happens!
// Here we create a deck, load some sample cards, and show them.

import java.util.Scanner;

public class FlashCardApp {

    private FlashCardDeck deck;
    private Scanner scanner;

    public FlashCardApp() {
        deck = new FlashCardDeck();
        scanner = new Scanner(System.in);
    }

    private void loadSampleCards() {
        deck.addCard(new FlashCard("Jh 3:16",
                "For God so loved the world, " +
                "that he gave his only begotton son..."));

        deck.addCard(new FlashCard("Ps23:1", "The Lord " +
                "is my shepherd..."));

        deck.addCard(new FlashCard("Gen1:1", "In the " +
                "beginning was the word..."));
    }

    public void run() {
        System.out.println("welcome to the Flash Card App!");
        loadSampleCards();

        for(int i = 0; i < deck.size(); i++) {
            FlashCard card = deck.getCard(i);

            System.out.println("\nReference: " + card.getQuestion());
            System.out.println("Press Enter to reveal the verse...");
            scanner.nextLine();  // Wait for user to press Enter

            System.out.println("Verse: " + card.getAnswer());
        }

        System.out.println("\nEnd of deck. Thanks for studying!");
    }

    // The main method — this is where Java starts the program.
    public static void main(String[] args) {
        FlashCardApp app = new FlashCardApp();
        app.run();
    }
}
