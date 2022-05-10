package sample;

public class Notita{

    private String TitluNotita, textNotita,dataCrearii;

    public Notita(String TitluNotita, String textNotita, String dataCrearii)
    {
        this.TitluNotita=TitluNotita;
        this.textNotita= textNotita;
        this.dataCrearii=dataCrearii;
    }
    public String getTitluNotita()
    {
        return TitluNotita;
    }
    public String getTextNotita()
    {
        return textNotita;
    }
    public String getDataCrearii()
    {
        return dataCrearii;
    }
}
