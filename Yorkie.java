public class Yorkie extends Terrier
{
    private String name;
    private String origin;
    private String life;
    private String temperament;
    private String activity;
    private String trainability;
    public Yorkie()
    {
        name="Yorkie";
        origin="England";
        life="13 to 20 years";
        temperament="Bold, Intelligent, Courageous, Confident, Independent";
        activity="High activity level";
        trainability="Level 3 out of 5";
    }
    public String toString()
    {
        String result=String.format("%s\nBreed Name:%s\nBreed Origin:%s\nLife span:"+
                                    "%s\nTemperament:%s\nActivity level:%s\nTrainability:"+
                                    "%s/n",super.toString(),name,origin,life,temperament,
                                    activity,trainability);
        return result;
    }
}