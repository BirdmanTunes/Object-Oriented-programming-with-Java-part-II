package week8._012_Online_Shop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
	
	private Map<String, Integer> prices;
	private Map<String, Integer> stocks;
	
	public Storehouse() {
		prices = new HashMap<String, Integer>();
		stocks = new HashMap<String, Integer>();

	}
	
	public void addProduct(String product, int price, int stock) {
		prices.put(product, price);
		stocks.put(product, stock);
	}

	public int price(String product) {
		for (String each: prices.keySet()) {
			if(product.equalsIgnoreCase(each)) {
				return prices.get(each);
			}
			
		}
		return -99;
	}
	
	public int stock(String product) {
		
		if(stocks.containsKey(product)) {
			return stocks.get(product);
			}
		return 0;
	}
	
	public boolean take(String product) {
		if (stocks.containsKey(product) && stocks.get(product) > 0) {
			stocks.put(product, stocks.get(product) - 1);
			return true;
		}
		return false;
	}
	
	public Set<String> products() {
		Set<String> prods = prices.keySet();
		
		return prods;
	}

}
