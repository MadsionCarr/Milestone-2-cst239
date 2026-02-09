package app;

/**
 * abstract class representing weapons
 * extention of salable products and share common behaviors thru this class
 */
public class Weapon extends SalableProduct {
	
	/**
	 * 
	 * @param name
	 * @param description
	 * @param price
	 * @param quantity
	 */
	public Weapon(String name, String description, double price, int quantity) {
		super(name, description, price, quantity);
	}

}
