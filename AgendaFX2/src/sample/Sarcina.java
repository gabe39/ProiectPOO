package sample;

import java.util.Comparator;

public class Sarcina {
    private String numeSarcina, termenLimita;
    private boolean terminatSarcina;

    public Sarcina(String NS, String TL, boolean TS) {
        this.numeSarcina = NS;
        this.termenLimita = TL;
        this.terminatSarcina = TS;
    }

    public String getNumeSarcina() {
        return this.numeSarcina;
    }

    public String getTermenLimita() {
        return this.termenLimita;
    }

    public boolean getTerminatSarcina() {
        return this.terminatSarcina;
    }

    public void setTerminatSarcina(boolean TS) {
        terminatSarcina = TS;
    }

    public static Comparator<Sarcina> ComparatorTerminatSarcina = (s1, s2) -> {
        Boolean TerminatSarcina1 = s1.getTerminatSarcina();
        Boolean TerminatSarcina2 = s2.getTerminatSarcina();

        //ordine crescatoare
        return TerminatSarcina1.compareTo(TerminatSarcina2);

        //ordine descrescatoare
        //return TerminatSarcina2.compareTo(TerminatSarcina1);
    };
}