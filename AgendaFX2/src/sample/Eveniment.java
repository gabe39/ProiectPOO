package sample;

import java.util.Comparator;

public class Eveniment
{

    private String DataEveniment, NumeEveniment, OraEveniment;

    public Eveniment(String NumeEveniment, String DataEveniment, String OraEveniment ){
        this.DataEveniment=DataEveniment;
        this.NumeEveniment=NumeEveniment;
        this.OraEveniment=OraEveniment;
    }

    public static Comparator<Eveniment> ComparatorOra = (e1, e2) -> {
        String OraEvenniment1 = e1.getOraEvenniment().toUpperCase();
        String OraEvenniment2 = e2.getOraEvenniment().toUpperCase();

        //ordine crescatoare
        return OraEvenniment1.compareTo(OraEvenniment2);

        //ordine descrescatoare
        //return NumePrenumeContact2.compareTo(NumePrenumeContact1);
    };

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
        return  OraEveniment ;
    }
}
