package sample;

public class Eveniment
{

    private String DataEveniment, NumeEveniment, OraEvenniment;

    public Eveniment(String DataEveniment, String NumeEveniment, String OraEvenniment ){
        this.DataEveniment=DataEveniment;
        this.NumeEveniment=NumeEveniment;
        this.OraEvenniment=OraEvenniment;
    }
    public String getDataEveniment()
    {
        return DataEveniment;
    }
    public String getNumeEveniment()
    {
        return  NumeEveniment;
    }
    public String getOraEvenniment ()
    {
        return  OraEvenniment ;
    }
}
