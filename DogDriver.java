package dogPack;
import java.util.Scanner;

public class DogDriver {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Dogs o = new Dogs();
		Breeds one = new Breeds("Golden Retriever", 11, 65, "mostly quiet", "easy");
		Breeds two = new Breeds("Labrador Retriever", 11, 70, "mostly quiet", "easy");
		Breeds three = new Breeds("Beagle", 13, 20, "vocal", "easy");
		Breeds four = new Breeds("Dachshund", 14, 25, "mostly quiet", "easy");
		Breeds five = new Breeds("Greyhound", 12, 65, "mostly quiet", "difficult");
		System.out.println("Welcome, please enter the corresponding number.");
		System.out.println("1) Golden Retriever");
		System.out.println("2) Labrador Retriever");
		System.out.println("3) Beagle");
		System.out.println("4) Dachshund");
		System.out.println("5) Greyhound");
		int i = kb.nextInt();
		if(i == 1)
			o.display(one);
		else if(i == 2)
			o.display(two);
		else if(i == 3)
			o.display(three);
		else if(i == 4)
			o.display(four);
		else
			o.display(five);
		
	}
}
