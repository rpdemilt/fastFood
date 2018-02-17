public class Terrier extends Dog
{
    private String origin;
    private String genetic;
    private String appearance;
    private String name;
    public Terrier()
    {
        name="Terrier";
        origin="Great Britian and Ireland";
        genetic="most terriers fall in the modern/hunting cluster of dog breeds"+ 
                "developed from the same pool of ancestors in Europe in the 19th"+ 
                "century.";
        appearance="weighs as little as 2.7 kg, up to 32 kg (70 lb) or more";
    }
    public String toString()
    {
        String result=String.format("Type Name:%s\nType Origin:%s\nGenetic:%s\nAppearance:%s\n",
                                    name,origin,genetic,appearance);
        return result;
    }
}