package fastFood;
import java.util.*;
public class Order {
	private String[] order;
	public Order(String... order) {
		this.order = order;
	}
	public Order(ArrayList<String> l) {
		String[] input = new String[l.size()];
		int i = 0
		for(String s : l) {
			s = input[i];
			i++;
		}
		order = input;
	}
	
	public double price() {
		double price = 0.0;
		for(String s : order) {
			switch (s) {
				case "BREAKFAST":
					price += 10.50;
				case "LUNCH":
					price += 11.50;
				case "DINNER":
					price += 20.50;
				case "DRINK":
					price += 2.50;
				case "SIDE":
					price += 1.00;
			}
		}
		return price;
	}
	public String[] getOrder() {
		return order;
	}
	public Order copy() {
		Order o = new Order(order);
		return o;
	}
	public boolean compare(Order o) {
		String[] comparison = o.getOrder();
		boolean same = false;
		for(String c : comparison) {
			for(String n: order) {
				if(c.equals(n)) {
					same = true;
				} else {
					same = false;
				}
			}
		}
		return same;
	}
}
