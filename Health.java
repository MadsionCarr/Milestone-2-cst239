package app;
/**
 * salable product
 * restores health, has preset attributes
 */
public class Health extends SalableProduct {
	
	/**
	 * created a health potion with preset name, description, price and qty
	 */

	public Health(String name, String description, double price, int quantity) {
		super("Health", "Restores a small amount of health", 25.0, 15);
		// TODO Auto-generated constructor stub
	}

}
