import java.util.*;
import java.lang.String;


public class Entrepot extends Coordonnee
{

    private int numEntrepot;
    private String natureStock;
    private int stock;
    /**
     * Constructeur d'objets de classe Entrepôt
     */
    public Entrepot()
    {
        // initialisation des variables d'instance
        super();
        numEntrepot = 0;
        natureStock = "nickel";
        stock = 0;

    }

    public Entrepot(int x, int y, int ne, String ns, int s)
    {
        super(x,y);
        numEntrepot = ne;
        natureStock = ns;
        stock = s;
    }

    public int getNumEnt()
    {
        return numEntrepot;
    }

    public String getNatureE()
    {
        return natureStock;
    }

    public int getStock()
    {
        return stock;
    }
}
