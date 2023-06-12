package Fundamentals_II.Part_10.OtherUsefulTechniques.SortThemCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        /*Iterator<Card> iterator = hand.iterator();

        while (iterator.hasNext()) {
            Card checkCard = iterator.next();
            checkCard.compareTo(iterator.next());
        }*/
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand anotherHand) {
        int sum1 = 0;
        int sum2 = 0;

        for (Card card : this.hand) {
            sum1 += card.getValue();
            card.getSuit().ordinal();
        }

        for (Card card : anotherHand.hand) {
            sum2 += card.getValue();
        }

        return sum1 - sum2;
    }

    public void sortBySuit(){
        Collections.sort(hand, new BySuitInValueOrder());
    }
}
