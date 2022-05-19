package sample;

import java.util.Comparator;

public class Alarma {

    private String ora, zile, numeAlarma;

    public Alarma(String NA, String O, String Z) {
        this.ora = O;
        this.zile = Z;
        this.numeAlarma = NA;
    }

    public static Comparator<Alarma> ComparatorOraAlarma = (a1, a2) -> {
        String OraAlarma1 = a1.getOra().toUpperCase();
        String OraAlarma2 = a2.getOra().toUpperCase();

        //ordine crescatoare
        return OraAlarma1.compareTo(OraAlarma2);

        //ordine descrescatoare
        //return NumePrenumeContact2.compareTo(NumePrenumeContact1);
    };

    public String getOra() {
        return this.ora;
    }

    public String getZile() {
        return this.zile;
    }

    public String getNumeAlarma() {
        return this.numeAlarma;
    }

}