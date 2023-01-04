import java.util.LinkedList;

public class Gettilewiththread implements Runnable
{
    public void run()
    {
        Singleton instance1 =  Singleton.getinstance();
        System.out.println("Instance  ID " + System.identityHashCode(instance1));
        System.out.println(instance1.getletterlist());
        LinkedList<String> player1tiles = instance1.gettiles(10);
        System.out.println("player  tiles " + player1tiles);
        System.out.println(instance1.getletterlist());
    }
}
