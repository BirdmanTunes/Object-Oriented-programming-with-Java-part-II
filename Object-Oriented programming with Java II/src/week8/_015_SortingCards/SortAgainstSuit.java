package week8._015_SortingCards;

import java.util.Comparator;

public class SortAgainstSuit implements Comparator<Card> {
    
    @Override
    public int compare(Card card1, Card card2) {
        int i = card1.getSuit() - card2.getSuit();
        
        if (i == 0) {
            return card1.getNumber() - card2.getNumber();
        }
        
        return i;
    }
}