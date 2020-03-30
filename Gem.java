import java.util.List;

public class Gem extends BasicEvoMat
{

    public Gem(String name, List<BasicEvoMat> evomat)
    {
        super(name, calcStam(evomat));
    }

    public Gem(String name, List<BasicEvoMat> evomat, double exp)
    {
        super(name, calcStam(evomat, exp));
    }

    private static double calcStam(List<BasicEvoMat> input)
    {
        int i = 0;
        double stam = 0;

        while (i < input.size()) {
            stam += input.get(i).retrieveStam();
            i++;
        }

        return stam;
    }

    private static double calcStam(List<BasicEvoMat> input, double expInput)
    {
        int i = 0;
        double stam = 0;
        double expToStamConversionRatio = 647500.0/23;

        while (i < input.size())
        {
            stam += input.get(i).retrieveStam();
            i++;
        }

        stam += (expInput/expToStamConversionRatio);

        return stam;
    }

    @Override
    public String retrieveName() {
        return super.retrieveName();
    }

    @Override
    public double retrieveStam() {
        return super.retrieveStam();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setStam(double stam) {
        super.setStam(stam);
    }
}
