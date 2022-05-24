package sample;

public class Buget
{
    private double venituri,cheltuieli;

    public Buget(double V,double C)
    {
        this.venituri=V;
        this.cheltuieli=C;
    }

    public double getVenituri()
    {
        return this.venituri;
    }

    public double getCheltuieli()
    {
        return this.cheltuieli;
    }

    public void setVenituri(double V)
    {
        this.venituri=V;
    }

    public void setCheltuieli(double C)
    {
        this.cheltuieli=C;
    }

    public double bugetRamas()
    {
        return (this.venituri-this.cheltuieli);
    }
}