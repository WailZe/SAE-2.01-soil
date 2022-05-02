public class Robot extends Coordonnee
{
    private int numRobot;
    private int capStokage;
    private int capExtraction;
    private int nbMinAct;

    public Robot(int x, int y, int num, int cS, int cE, int nbM)
    {
        super(x,y);
        numRobot = num;
        capStokage = cS;
        capExtraction = cE;
        nbMinAct = nbM;

    }

    public int getNumRobot()
    {
        return this.numRobot;
    }

    public int getMinAct()
    {
        return this.nbMinAct;
    }

    public int getCapStock()
    {
        return this.capStokage;
    }

    public int getCapExtract()
    {
        return this.capExtraction;
    }

}
