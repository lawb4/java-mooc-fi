package Fundamentals_II.Part_10.OtherUsefulTechniques.SortThemCards;

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        // If the Suits are the same (i.e SPADES)
        if (c1.getSuit().ordinal() - c2.getSuit().ordinal() == 0) {
            if (c1.getValue() > c2.getValue()) {
                //System.out.println("The first card is more valuable");
                return 1;
            } if (c1.getValue() < c2.getValue()) {
                //System.out.println("The second card is more valuable");
                return -1;
            }
        }

        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }

    /*@Override
    public int compare(Card c1, Card c2) {
        if (c1.getSuit() == c2.getSuit()) {
            return c1.getValue() - c2.getValue();
        }

        return c1.getSuit().compareTo(c2.getSuit());
    }*/
}
