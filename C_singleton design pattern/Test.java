import java.nio.charset.MalformedInputException;
import java.util.LinkedList;

public class Test 
{
    public static void main(String[] args) 
    {
        Singleton instance1 =  Singleton.getinstance();
        System.out.println("Instance 1 ID " + System.identityHashCode(instance1));
        System.out.println(instance1.getletterlist());
        LinkedList<String> player1tiles = instance1.gettiles(10);
        System.out.println("player 1 tiles " + player1tiles);
        System.out.println(instance1.getletterlist());

        Singleton instance2 =  Singleton.getinstance();
        System.out.println("\n\n"+"Instance 2 ID " + System.identityHashCode(instance2));
        System.out.println(instance2.getletterlist());
        LinkedList<String> player2tiles = instance2.gettiles(10);
        System.out.println("player 2 tiles " + player2tiles);
        System.out.println(instance2.getletterlist());
    }
}
