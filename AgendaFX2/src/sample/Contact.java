package sample;

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
}
