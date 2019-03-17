package week8._012_Online_Shop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
	
	private Map<String, Purchase> basket;
	private int total;
	
	public ShoppingBasket() {
		basket = new HashMap<String, Purchase>();
		total=0;
	}
	
	public void add(String product, int price) {
		total += price;
		if (basket.containsKey(product)) {
			basket.get(product).increaseAmount();
		} else {
			basket.put(product, new Purchase(product, 1, price));
		}
	}
	
	public int price() {
		return total;
	}
	
	public void print() {
		for (Purchase each:basket.values()) {
			System.out.println(each);
		}
	}
}
