
public class Robot extends Coordonnee
{

    private int numRobot;
    private int capStokage;
    private int capExtraction;
    private int nbMinAct;
    private coordonnee lescoordonnee;

    public Robot(int num, int cS, int cE, int nbM, coordonnee lc)
    {
        numRobot = num;
        capStokage = cS;
        capExtraction = cE;
        nbMinAct = nbM;
        lescoordonee = lc;
        
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
    
    public void nord()
    {
        int mouv = new coordonnee();
    }
    
    public void sud()
    {
        int mouv = new coordonnee();
    }
    
        public void ouest()
    {
        int mouv = new coordonnee();
    }
    
    public void est()
    {
        int mouv = new coordonnee();
    }
    
}
