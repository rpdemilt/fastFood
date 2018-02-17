public class Retriever extends Dog
{
	private String origin;
	private String genetic;
	private String appearance;
	private String name;
	public Retriever()
	{
		name = "Retriever";
		origin = "Scotland";
		genetic = "Retrievers were bred primarily to retrieve birds or other prey " +
				  "and return them to the hunter without damage.";
		appearance = "weighs anywhere from 25kg to 34kg";
	}
	public String toString()
	{
		String result = String.format("Type Name:%s\nType Origin:%s\nGenetic:%s\nAppearance:%s\n",
									  name,origin,genetic,appearance);
		return result;
	}
}