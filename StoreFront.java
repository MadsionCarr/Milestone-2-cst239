package app;

import java.util.Scanner;
/**
 * storeFront class
 */

public class StoreFront {
	
	private InventoryManager inventory;
	
	/**
	 * shopping cart
	 */
	private ShoppingCart cart;
/**
 * entry point of store front
 * @param no real arguments at this time
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StoreFront storeFront = new StoreFront();
		storeFront.run();
	}
	
	/**
	 * sets up the store and begins menu loop
	 */
	
	public void run() {
		
		System.out.println("=== Welcome to Madison's Game Store! ==="); 
		System.out.println("Your adventure begins here. Browse items, gear up, and prepare for battle!");
		
		inventory = new InventoryManager();
		cart = new ShoppingCart();
		inventory.initializeInventory();
		
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		
		while(running) {
			displayMenu();
			int choice = getUserChoice(sc);
			
			switch(choice) {
			case 1:
				viewProducts();
				break;
				
			case 2: 
				purchaseProduct(sc);
				break;
			case 3: 
				cancelPurchase(sc);
				break;
				
			case 4: 
				viewCart();
				break;
			
			case 0:
				running = false;
				System.out.println("Exiting Store... Goodbye!");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
					
				
			}
		}
		
		sc.close();
		
	}
		/**
		 * display menu options
		 */
		public void displayMenu() {
			System.out.println("\n===== STORE MENU ====="); 
			System.out.println("1. View Products"); 
			System.out.println("2. Purchase Product"); 
			System.out.println("3. Cancel Purchase"); 
			System.out.println("4. View Cart"); 
			System.out.println("0. Exit"); 
			System.out.print("Choose an option: "); 
		}
		
		/**
		 * reads the user's menu choice
		 * @param sc
		 * @return
		 */
		private int getUserChoice(Scanner sc) {
			while(!sc.hasNextInt()) {
				System.out.println("Please enter a number.");
				sc.next();
			}
			return sc.nextInt();
			
		}
		/**
		 * displays all products in the inventory
		 */
		
		private void viewProducts() {
			System.out.println("\n--- Available Products ---");
			for (SalableProduct p : inventory.getAllProducts()) {
				System.out.println(p);
			
			}
		}
		/**
		 * handles purchasing a product
		 * @param sc
		 */
		private void purchaseProduct(Scanner sc) {
			sc.nextLine();
			System.out.print("Enter product name: ");
			String name = sc.nextLine();
			
			
			if(inventory.purchase(name, 1)) {
				SalableProduct product = inventory.findByName(name);
				cart.addItem(product);
				System.out.println("Purchase added to cart!");
				
			} else {
				System.out.println("Product not found or out of stock");
			}
		}
		
		/**
		 * handles canceling a purchase 
		 * @param sc
		 */
		
		private void cancelPurchase(Scanner sc) {
			sc.nextLine();
			System.out.println("Enter product name to remove: ");
			String name = sc.nextLine();
			
			cart.removeItem(name);
			inventory.cancelPurchase(name, 1);
			System.out.println("Item removed");
		}
		/**
		 * displays the contents of the shopping cart
		 * @param sc
		 */
		private void viewCart() {
			System.out.println("\n--- Shopping Cart ---");
			cart.viewCart();
		}
		
		}
	
		
	


