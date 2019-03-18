package week8._015_SortingCards;

public class Card implements Comparable<Card>{
	
    public static final int SPADES  = 0;
    public static final int DIAMONDS  = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS   = 3;
    
    private int number;
    private int suit;
    
    private final String[] CARDS = {"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private final String[] SUITS = {"Spades", "Diamonds", "Hearts", "Clubs"};
    
    public Card(int number, int type) {
    	this.number=number;
    	this.suit=type;
    }
    
    public int getNumber() {
    	return number;
    }
    
    public int getSuit() {
    	return suit;
    }
    
    public String toString() {
    	return CARDS[number - 1] + " of " + SUITS[suit];
    }
    
    public int compareTo(Card card) {
        int i = this.number - card.number;
        
        if (i != 0) {
            return i;
        }
        
        return this.suit - card.suit;
    }
}
