import java.util.Scanner;

public class testing 
{
    public static void dofight(Enemyship tobefought)
    {
        tobefought.displayenemyship();
        tobefought.followheroship();
        tobefought.enemyshipshoots();
    }

    public static void main(String[] args) 
    {
        //construct a factory  
        Enemyshipfactory  shipfactory = new Enemyshipfactory(); //only can use final or without modifierrs inside the methods in java 
        //only allow local variables insode a method in java 
        Enemyship tobetested = null;
        
        Scanner input = new Scanner(System.in);

        System.out.println("what type of enemy ship do you want : ( U / R / S) ");


        if ( input.hasNextLine()) 
        {
            String enemyshiptype = input.nextLine();
            tobetested = shipfactory.makeenemyship(enemyshiptype);
            if ( tobetested != null) dofight(tobetested); /* we only can call static methods inside another static method
            so we want to make dofight as static or else create a object of a testing class and call the dofight method from that */
            else System.out.println("correctly give the enemy ship type");
        }
    }
}
