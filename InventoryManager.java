package app;

import java.util.ArrayList;
import java.util.List;

/**
 * manages the store inventory of salable products
 * Supports initializing products, purchasing, and canceling purchases
 */

public class InventoryManager {
	
	private List<SalableProduct> products = new ArrayList<>();
	
	/**
	 * initializes the inventory with default products
	 * add 2 weapons, 2 armors, 1 health item
	 */
	public void initializeInventory() {
		
		products.add(new Weapon("Bow", "Sharp, long, steele weapon", 50.0, 10));
		products.add(new Weapon("Sword", "Sharp, long, steele weapon", 50.0, 10));
		products.add(new Armor("Iron Shield", "Defensive shield", 60.0, 6));
		products.add(new Armor("Iron Chest Plate", "Protective torso armor", 75.0, 5));
		products.add(new Health("Health Potion", "Restores health", 25.0, 10));
		
	}
	
	public void addProduct(SalableProduct product) {
		products.add(product);
	}
	
	/**
	 * 
	 * @return all products to the inventory
	 */
	
	public List<SalableProduct> getAllProducts(){
		return products;
	}
	/**
	 * finds products by name (case - sensitive)
	 * @param name
	 * @return
	 */
	
	public SalableProduct findByName(String name) {
		for (SalableProduct p: products) {
			if(p.getName().equalsIgnoreCase(name)) {
				return p;
			}
		}
		
		return null;
	}
	
	/**
	 * attempts to purchase a product by reducing its qty
	 * @param name
	 * @param qty
	 * @return true if successful
	 */
	public boolean purchase(String name, int qty) {
		SalableProduct product = findByName(name);
		
		if(product != null && product.getQuantity() >= qty) {
			product.setQuantity(product.getQuantity() - qty);
			return true;
		}
		return false;
	}
	/**
	 * cancels a purchase by adding qty back to the product
	 * @param name
	 * @param qty
	 * @return true if successful
	 */
	public boolean cancelPurchase(String name, int qty) {
		SalableProduct product = findByName(name);
		
		if(product != null) {
			product.setQuantity(product.getQuantity() + qty);
			return true;
		}
		
		return false;
	}
	
	
	

}
