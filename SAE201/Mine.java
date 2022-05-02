public class Mine extends Coordonnee

{
    private int numMine;
    private int nbMinerais;
    private String natureMinerais;
    private int capaciteInit;

    /**
     * Constructeur d'objets de classe Mine
     */
    public Mine()
    {
        // initialisation des variables d'instance
        super();
        numMine = 0;
        nbMinerais = 150;
        natureMinerais = "nickel";
        capaciteInit = 150;

    }

    public Mine(int x, int y, int nm, int nbm, String natM, int ci)
    {
        super(x ,y);
        numMine = nm;
        nbMinerais = nbm;
        natureMinerais = natM;
        capaciteInit = ci;
    }

    public int getNumM()
    {
        return numMine;
    }

    public String getNature()
    {
        return natureMinerais;
    }

    public int getNbMinerais()
    {
        return nbMinerais;
    }

    public int getCapInit()
    {
        return capaciteInit;
    }
}
