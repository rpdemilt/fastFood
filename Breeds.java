package dogPack;

public class Breeds extends Dogs{

	private String breed;
	private int age;
	private int weight;
	private String bark;
	private String trainability;
	private String type;
	
	public Breeds(String s, int a, int w, String b, String t) {
		breed = s;
		age = a;
		weight = w;
		bark = b;
		trainability = t;
		if(s.equals("Golden Retriever") || s.equals("Labrador Retriever"))
			type = "retrievers";
		if(s.equals("Beagle") || s.equals("Dachshud") || s.equals("Greyhound"))
			type = "hounds";
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public int getWeight() {
		return weight;
	}
	public String getBark() {
		return bark;
	}
	public String getTrainability() {
		return trainability;
	}
	public String getType() {
		return type;
	}
	
}
