package Deckofcards;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.printf(">>before : %s\n", deck);
        deck.shuffle();
        System.out.printf(">> after : %s\n", deck);
    }
    
}
