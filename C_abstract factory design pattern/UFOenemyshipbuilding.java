
public class UFOenemyshipbuilding extends Enemyshipbuilding
{
    protected Enemyship Makeenemyship(String typeofship)
    {
        Enemyship theenemyship = null;

        if (typeofship.equals("UFO"))
        {
            Enemyshipfactory shippartsfactory = new UFOenemyshipfactory();
            theenemyship = new UFOenemyship(shippartsfactory);
            theenemyship.setname("UFO Grunt Ship");

        }
        else if(typeofship.equals("UFO BOSS"))
        {
            Enemyshipfactory shippartsfactory = new UFOBOSSenemyshipfactory();
            theenemyship = new UFOBOSSenemyship(shippartsfactory);
            theenemyship.setname("UFO BOSS Ship");
        }

        return theenemyship;
    }
}
