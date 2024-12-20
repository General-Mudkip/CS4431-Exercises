package MiscStuff;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {
    enum Suit {
        SPADES,
        HEARTS,
        ACES,
        CLUBS
    }

    enum Face {
        ACE,
        KING,
        QUEEN,
        JACK,
        TEN,
        NINE,
        EIGHT,
        SEVEN,
        SIX,
        FIVE,
        FOUR,
        THREE,
        TWO,
    }

    private static class Card {
        public Suit suit;
        public Face face;

        public Card(Suit suit, Face face) {
            this.suit = suit;
            this.face = face;
        }

        public String getStringifiedCard() {
            return this.face + " of " + this.suit;
        }
    }

    private static class Deck {
        public ArrayList<Card> cards;

        public Deck() {
            reshuffleDeck();
        }

        public void reshuffleDeck() {
            cards = new ArrayList<>();

            int counter = 0;
            for (Suit suit: Suit.values()) {
                for (Face face : Face.values()) {
                    cards.add(new Card(suit, face));
                    counter++;
                }
            }
        }

        public Card getRandomCard() {
            int randomIndex = (int) (Math.random() * this.cards.size());

            Card cardToReturn = this.cards.get(randomIndex);
            this.cards.remove(randomIndex);

            return cardToReturn;
        }
    }

    public static class Player {
        public Card[] hand;

        public Player(Card[] cards) {
            this.hand = cards;
        }

        public boolean hasTwoPair() {
            for (Card card1 : this.hand) {
                for (Card card2 : this.hand) {
                    if (card1.face == card2.face) {
                        System.out.println(card1.face);
                        System.out.println(card2.face);
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Deck deck = new Deck();

        while (true) {
            Card c1 = deck.getRandomCard();
            Card c2 = deck.getRandomCard();
            Card c3 = deck.getRandomCard();
            Card c4 = deck.getRandomCard();
            Card c5 = deck.getRandomCard();
            Player p1 = new Player(new Card[]{c1, c2, c3, c4, c5});
            for (Card c : p1.hand) {
                System.out.println(c.face);
            }
            System.out.println(p1.hasTwoPair());
            sca.nextLine();
        }
    }
}
