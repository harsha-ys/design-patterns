//This is adaptee
import java.util.Random;
public class enemyRobot 
{
    Random generator = new Random();
    public void smashWithHands()
    {
        int attackDamage = generator.nextInt(10) +1;
        System.out.println("Enemy ROBOT causes "+attackDamage+" amount of damage by its hand");

    }
    public void walkForward()
    {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy ROBOT walks forward " + movement + " spaces");

    }
    public void reactToHuman(String driverName)
    {
        System.out.println("Enemy ROBOT tramps on "+ driverName);
    }
}
