package Fundamentals_II.Part_10.OtherUsefulTechniques.SortThemCards;

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if (value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card card) {
        if (this.value - card.value == 0) {
            if (this.getSuit().ordinal() > card.getSuit().ordinal()) {
                //System.out.println("The first card is more valuable");
                return 1;
            } if (this.getSuit().ordinal() < card.getSuit().ordinal()) {
                //System.out.println("The second card is more valuable");
                return -1;
            }
        }

        return this.value - card.value;
    }

    /*@Override
    public int compareTo(Card another) {
        if (value == another.value) {
            return suit.ordinal() - another.suit.ordinal();
        }

        return value - another.value;
    }*/
}
