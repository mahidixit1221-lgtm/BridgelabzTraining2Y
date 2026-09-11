import java.util.Scanner;

public class Program10_DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int k = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber =
                    i + (int)(Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    public static String[][] distribute(String[] deck, int players) {
        if (players <= 0 || deck.length % players != 0) {
            return null;
        }

        int cardsPerPlayer = deck.length / players;
        String[][] result = new String[players][cardsPerPlayer];

        int k = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                result[i][j] = deck[k++];
            }
        }

        return result;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");

            for (String card : players[i]) {
                System.out.println(card);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        String[][] result = distribute(deck, players);

        if (result == null) {
            System.out.println("Cards cannot be equally distributed.");
        } else {
            printPlayers(result);
        }

        sc.close();
    }
}