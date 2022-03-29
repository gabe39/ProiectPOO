package com.Agenda;
import java.util.Scanner;

public class Contact
{
    private Scanner scan = new Scanner(System.in);
    public String _nume,_prenume,_adresa;
    public int _nrTelefon,_nrTelefonAcasa;

    public void CreareContact(String nume, String prenume, String adresa,int nrTelefon, int nrTelefonAcasa)
    {
        _nume = nume;
        _prenume = prenume;
        _adresa = adresa;
        _nrTelefon = nrTelefon;
        _nrTelefonAcasa = nrTelefonAcasa;
    }

    public void CitireContact()
    {
        System.out.print("Introduceti Nume: "); _nume = scan.next();
        System.out.print("Introduceti Prenume: "); _prenume = scan.next();
        System.out.print("Introduceti Adresa: "); _adresa = scan.next();
        System.out.print("Introduceti Nr Telefon: "); _nrTelefon = scan.nextInt();
        System.out.print("Introduceti Nr Telefon Acasa: "); _nrTelefonAcasa = scan.nextInt();
    }

    public void AfisareContact()
    {
        System.out.print("Nume: "+_nume+" Prenume: "+_prenume+"\n Adresa: "+"\n Nr Telefon: "+_nrTelefon+" Nr Telefon Acasa: "+_nrTelefonAcasa);
    }
}
