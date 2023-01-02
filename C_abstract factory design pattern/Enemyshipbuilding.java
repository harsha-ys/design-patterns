
public abstract class Enemyshipbuilding 
{
    protected abstract Enemyship Makeenemyship(String typeofship);
    public Enemyship Ordertheship(String typeofship)
    {
        Enemyship theenemyship = Makeenemyship(typeofship);

        theenemyship.makeship();
        theenemyship.displayenemyship();
        theenemyship.followheroship();
        theenemyship.enemyshipshoots();

        return theenemyship;
    }
}
