package dogPack;

public class Dogs {

	private String type;
	
	public Dogs() {

	}
	public void display(Breeds g) {
		System.out.println("The " + g.getBreed() + " is a breed of " + g.getType() + ".");
		System.out.println("Has an average lifespan of " + g.getAge() + " years, and can grow up to " + g.getWeight() + " pounds.");
		System.out.println("The dog is " + g.getBark() + " and is " + g.getTrainability() + "to train.");
	}
	
}
