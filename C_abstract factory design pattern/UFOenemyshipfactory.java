public class UFOenemyshipfactory implements Enemyshipfactory
{
    public enemyshipweapon addweapon()
    {
        return new addUFOweapon();

    }
    public enemyshipengine addengine()
    {
        return new addUFOengine();
    }
}
