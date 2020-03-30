
public class BasicEvoMat
{
    private String name;
    private double stam;

    //Constructors
    public BasicEvoMat()
    {
        name = "";
        stam = 0;
    }

    public BasicEvoMat(String name, double stam)
    {
        this.name = name;
        this.stam = stam;
    }

    //Accessor Methods
    public String retrieveName()
    {
        return this.name;
    }

    public double retrieveStam()
    {
        return this.stam;
    }

    //Mutator Methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setStam(double stam)
    {
        this.stam = stam;
    }

}
