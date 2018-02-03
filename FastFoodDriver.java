package fastFood;

import java.util.*;

public class FastFoodDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Order order;
		Inventory inventory = new Inventory();
		
		System.out.println("Welcome to Penguinz.");
		order = takeOrder(keyboard);
		
		inventory.decreaseInventory(order);
		System.out.println("Thank you, your price will be " + order.price());
		
		keyboard.close();
	}
	public static Order takeOrder(Scanner keyboard) {
		
		ArrayList<String> order = new ArrayList<String>();
		String input = "";
		while(!input.toUpperCase().equals("DONE"))
		System.out.println("What would you like to order? <Valid Entries: BREAKFAST, LUNCH, DINNER, DRINK, SIDE, DONE to quit>");
		input = keyboard.next();
		input.toUpperCase();
		if(validateInput(input)) {
			order.add(input);
		}
		return new Order(order);
	}
	public static boolean validateInput(String s) {
		if(s.equals("BREAKFAST")) {
			return true;
		} else if(s.equals("DINNER")){
			return true;
		} else if(s.equals("LUNCH")){
			return true;
		} else if(s.equals("SIDE")){
			return true;
		} else if(s.equals("DRINK")){
			return true;
		} else {
			return false;
		}
	}

}
