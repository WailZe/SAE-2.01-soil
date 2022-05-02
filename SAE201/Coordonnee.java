public class Coordonnee
{

    private int x;
    private int y;

    /**
     * Constructeur d'objets de classe Coordonnee
     */
    public Coordonnee()
    {
        // initialisation des variables d'instance
        x = 0;
        y = 0;
    }

    public Coordonnee(int vx, int vy)
    {
        x = vx;
        y = vy;
    }

    public int getPosition()
    {
        return x + y;
    }

    public void Nord()
    {
        this.x=this.x+1;
    }

    public void Sud()
    {
        this.x=this.x-1;
    }

    public void Ouest()
    {
        this.y=this.y-1;
    }

    public void Est()
    {
        this.y=this.y+1;
    }
}

