package fastFood;
import java.util.Random;
public class Inventory {
	private String[][] inventory;
	public Inventory() {
		initializeInventory();
	}
	private void initializeInventory(){
		Random rand = new Random();
		String [][] inventory = new String[5][2];
		
		inventory[0][0] = "BREAKFAST";
		inventory[0][1] =  "" + rand.nextInt() + 1;
		inventory[1][0] = "LUNCH";
		inventory[1][1] =  "" + rand.nextInt() + 1;
		inventory[2][0] = "DINNER";
		inventory[2][1] =  "" + rand.nextInt() + 1;
		inventory[3][0] = "SIDE";
		inventory[3][1] =  "" + rand.nextInt() + 1;
		inventory[4][0] = "DRINK";
		inventory[4][1] = "" + rand.nextInt() + 1;
	}
	public void decreaseInventory(Order o) {
		String[] order = o.getOrder();
		for(String item : order) {
			int i;
			switch(item) {
			case "BREAKFAST":
				i = Integer.parseInt(inventory[0][1]);
				i--;
				inventory[0][1] = "" + i;
			case "LUNCH":
				i = Integer.parseInt(inventory[1][1]);
				i--;
				inventory[1][1] = "" + i;
			case "DINNER":
				i = Integer.parseInt(inventory[2][1]);
				i--;
				inventory[2][1] = "" + i;
			case "DRINK":
				i = Integer.parseInt(inventory[3][1]);
				i--;
				inventory[3][1] = "" + i;
			case "SIDE":
				i = Integer.parseInt(inventory[4][1]);
				i--;
				inventory[4][1] = "" + i; 
			}
		}
	}
	public String toString() {
		String output = "";
		for(String[] s : inventory) {
			for(String n : s) {
				output += s + " ";
			}
			output += "\n";
		}
		return output;
	}
}
