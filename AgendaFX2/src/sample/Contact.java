package sample;

import javafx.beans.property.SimpleStringProperty;

import java.util.Comparator;

public class Contact {

    private String _nume,_prenume,_adresa,_telefon,_telefonAcasa;

    public Contact()
    {
        this._nume ="";
        this._prenume ="";
        this._adresa ="";
        this._telefon ="";
        this._telefonAcasa ="";
    }

    public Contact(String nume, String prenume, String adresa,String telefon, String telefonAcasa)
    {
        this._nume = nume;
        this._prenume = prenume;
        this._adresa = adresa;
        this._telefon = telefon;
        this._telefonAcasa = telefonAcasa;
    }

    public void Afisare()
    {
        System.out.print("\n"+_nume+" "+_prenume+" "+_adresa+" "+_telefon+" "+_telefonAcasa);
    }

    public static Comparator<Contact> ComparatorNumePrenume = (c1, c2) -> {
        String NumePrenumeContact1 = c1._nume.toUpperCase()+" "+c1._prenume.toUpperCase();
        String NumePrenumeContact2 = c2._nume.toUpperCase()+" "+c2._prenume.toUpperCase();

        //ordine crescatoare
        return NumePrenumeContact1.compareTo(NumePrenumeContact2);

        //ordine descrescatoare
        //return NumePrenumeContact2.compareTo(NumePrenumeContact1);
    };

    public String get_nume() {
        return _nume;
    }

    public String get_prenume() {
        return _prenume;
    }

    public String get_adresa() {
        return _adresa;
    }

    public String get_telefon() {
        return _telefon;
    }

    public String get_telefonAcasa() {
        return _telefonAcasa;
    }
}
