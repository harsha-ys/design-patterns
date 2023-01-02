public class UFOBOSSenemyshipfactory implements Enemyshipfactory
{
    public enemyshipweapon addweapon()
    {
        return new UFOBOSSweapon();
    }
    public enemyshipengine addengine()
    {
        return new UFOBOSSengine();
    }
}
