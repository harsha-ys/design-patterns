public class Enemyshipfactory 
{
    public Enemyship makeenemyship(String enemyshiptype)
    {
        return ( enemyshiptype.equals("U"))? new UFOenemyship() : ( enemyshiptype.equals("R")? new ROCKETenemyship() :( enemyshiptype.equals("S")? new SUPERUFOenemyship() : null) ) ;
    }    
}
