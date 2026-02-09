package app;

/**
 * /**
	 * abstract class representing Armor
	 * armor items are salable products that extend from salable products
	 * 
	 *
 */

public class Armor extends SalableProduct {
		
		/**
		 * created new armor with preset attributes
		 * @param name
		 * @param description
		 * @param price
		 * @param quantity
		 */
		public Armor(String name, String description, double price, int quantity) {
			super(name, description, price, quantity);
		}

	}

