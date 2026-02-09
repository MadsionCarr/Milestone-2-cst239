package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * represents users cart
 * stores products and qty, calculated total
 */
public class ShoppingCart {
	
	private List<SalableProduct> items = new ArrayList<>();
	
	/**
	 * add a product to the cart 
	 * @param product
	 */
	
	public void addItem(SalableProduct product) {
		if(product == null) {
			items.add(product);
		}
	
	}
	
	/**
	 * removes product from cart by name
	 */
	public void removeItem(String name) {
		items.removeIf(p -> p.getName().equalsIgnoreCase(name));
	}
	/**
	 * clear all items from the cart
	 */
	public void clearCart() {
		items.clear();
		
	}
	/**
	 * displays content of the cart plus price
	 */
	public void viewCart() {
		if(items.isEmpty()) {
			System.out.println("Your cart is empty.");
			return;
		}
		
		System.out.println("Items in your cart: ");
		for(SalableProduct p : items) {
			System.out.println(p.getName() + " =$" + p.getPrice());
			
		}
		
		System.out.println("Total: $" + getTotal());
	}
	
	/**
	 * calculates total cost of items in cart
	 * @return
	 */
	public double getTotal() {
		double total = 0;
		
		for (SalableProduct p : items) {
			total += p.getPrice();
		}
		
		return total;
	}
}
