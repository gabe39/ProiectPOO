package sample;

public class Buget
{
    private String numeTipBuget,tipBuget;
    public float suma;

    public Buget(String numeTipBuget, String tipBuget, float suma) {
        this.numeTipBuget = numeTipBuget;
        this.tipBuget = tipBuget;
        this.suma = suma;
    }

    public String getNumeTipBuget() {
        return numeTipBuget;
    }

    public String getTipBuget() {
        return tipBuget;
    }

    public String getStringSuma()
    {
        String strSuma = null;
        if(tipBuget.equals("Venit")) strSuma = "+" + suma;
        else if(tipBuget.equals("Cheltuieli")) strSuma = "-" + suma;

        return strSuma;
    }
}