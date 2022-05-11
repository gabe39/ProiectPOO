package sample;

import java.util.Comparator;

public class Notita{

    private String TitluNotita, textNotita,dataCrearii;

    public Notita(String TitluNotita, String textNotita, String dataCrearii)
    {
        this.TitluNotita=TitluNotita;
        this.textNotita= textNotita;
        this.dataCrearii=dataCrearii;
    }

    public void Afisare()
    {
        System.out.print("\n"+TitluNotita+" "+textNotita+" "+dataCrearii);
    }

    public static Comparator<Notita> ComparatorTitlu = (n1, n2) -> {
        String TitluNotita1 = n1.getTitluNotita().toUpperCase();
        String TitluNotita2 = n2.getTitluNotita().toUpperCase();

        //ordine crescatoare
        return TitluNotita1.compareTo(TitluNotita2);

        //ordine descrescatoare
        //return NumePrenumeContact2.compareTo(NumePrenumeContact1);
    };

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
