import java.util.Random;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 29, 30
 * Assumptions: card is from 0 through 51. Compile with ShuffleDemo.java.
 */
public class DeckOfCards {
    static String cardName(int card) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7",
                          "8", "9", "10", "Jack", "Queen", "King"};
        return ranks[card % 13] + " of " + suits[card / 13];
    }

    public static void main(String[] args) {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) deck[i] = i;
        ShuffleDemo.shuffle(deck, new Random(7));
        for (int i = 0; i < 4; i++) {
            System.out.println(cardName(deck[i]));
        }
    }
}
