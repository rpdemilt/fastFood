public class GoldenRetriever extends Retriever
{
	private String name;
	private String origin;
	private String life;
	private String temperament;
	private String activity;
	private String trainability;
	public GoldenRetriever()
	{
		name = "Golden Retriever";
		origin = "Scotland";
		life = "10 to 12 years";
		temperament = "Intelligent, Friendly, Devoted";
		activity = "High activity level";
		trainability = "Level 1 out of 5";
	}
	public String toString()
	{
		String result = String.format("%s\nBreed Name:%s\nBreed Origin:%s\nLife span:"+
                                    "%s\nTemperament:%s\nActivity level:%s\nTrainability:"+
                                    "%s/n",super.toString(),name,origin,life,temperament,
                                    activity,trainability);
        return result;
	}
}
		
		