package sample;import java.util.Comparator;

public class Contact {

    public String _nume,_prenume,_adresa,_telefon,_telefonAcasa;

    public Contact()
    {
        this._nume = "";
        this._prenume = "";
        this._adresa = "";
        this._telefon = "";
        this._telefonAcasa = "";
    }

    public Contact(String nume, String prenume, String adresa,String telefon, String telefonAcasa)
    {
        this._nume = nume;
        this._prenume = prenume;
        this._adresa = adresa;
        this._telefon = telefon;
        this._telefonAcasa = telefonAcasa;
    }

    public static Comparator<Contact> ComparatorNumePrenume = new Comparator<Contact>()
    {
        public int compare(Contact c1, Contact c2)
        {
            String NumePrenumeContact1 = c1._nume.toUpperCase()+" "+c1._prenume.toUpperCase();
            String NumePrenumeContact2 = c2._nume.toUpperCase()+" "+c2._prenume.toUpperCase();

            //ordine crescatoare
            return NumePrenumeContact1.compareTo(NumePrenumeContact2);

            //ordine descrescatoare
            //return NumePrenumeContact2.compareTo(NumePrenumeContact1);
        }
    };
}
