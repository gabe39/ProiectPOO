package sample;

public class Buget
{
    private float venituri,cheltuieli, current;

    public Buget(float V,float C)
    {
        this.venituri=V;
        this.cheltuieli=C;
    }

    public float getVenituri()
    {
        return this.venituri;
    }

    public float getCheltuieli()
    {
        return this.cheltuieli;
    }

    public float setVenituri(float V)
    {
       return this.venituri=V;
    }

    public void setCheltuieli(float C)
    {
        this.cheltuieli=C;
    }

    public float bugetRamas()
    {
        return (this.venituri-this.cheltuieli);
    }
}