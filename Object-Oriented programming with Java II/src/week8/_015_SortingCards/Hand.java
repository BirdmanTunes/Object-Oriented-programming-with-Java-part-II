package week8._015_SortingCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    
    private List<Card> cards;
    private int total;
    
    public Hand() {
        cards = new ArrayList<Card>();
    }
    
    public void add(Card card) {
    	total += card.getNumber();
        cards.add(card);
    }
    
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public int compareTo(Hand hand) {
    	
    	if (this.total == hand.total)
    		return 0;
    	if (this.total > hand.total)
    		return 1;
    	else {
			return -1;
		}
    }
    
    public void sortAgainstSuit() {
    	Collections.sort(cards, new SortAgainstSuit());
    }
}
