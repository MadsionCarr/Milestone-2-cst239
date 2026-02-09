package app;

public abstract class SalableProduct {
	
	/**
	 * products that can be sold in the store
	 * each product has name, description, price, and quantity
	 */
	private String name;
	private String description;
	private double price;
	private int quantity;
	
	/**
	 * creates new salable product with the given attributes
	 * @param name
	 * @param description
	 * @param price
	 * @param quantity
	 */
	public SalableProduct(String name, String description, double price, int quantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		
	
		
	}
	/**
	 * getters
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 
	 * @return price
	 */
	public double getPrice() {
		return price;
		
	}
	/**
	 * 
	 * @return quantity
	 */
	
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * setters
	 */

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * returns string to represent the product 
	 * and price and how much is available
	 */
	@Override
	public String toString() {
		return name + " - $" + price + " (" + quantity + " available)";
	}
}
