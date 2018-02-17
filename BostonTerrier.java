public class BostonTerrier extends Terrier
{
    private String name;
    private String origin;
    private String life;
    private String temperament;
    private String activity;
    private String trainability;
    public BostonTerrier()
    {
        name="BostonTerrier";
        origin="United States of America";
        life="13 -15 years";
        temperament="Intelligent, Lively, Friendly";
        activity="Hign energy";
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