import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton 
{
    private static Singleton onlyoneinstance = null;
    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};
    
    private LinkedList<String> letters = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    static boolean firstthread = true;

    private Singleton(){};

    public static synchronized Singleton getinstance()
    {
        if (onlyoneinstance == null )
        {
            if (firstthread)
            {
                firstthread = false;
                Thread.currentThread();
                try
                {                   
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

            onlyoneinstance = new Singleton();
            Collections.shuffle(onlyoneinstance.getletterlist());
        }
        return onlyoneinstance;
    }

    public LinkedList<String> getletterlist()
    {
        return this.letters;
    }

    public LinkedList<String> gettiles(int howmany)
    {
        LinkedList<String> tobereturn = new LinkedList<String>();
        for(int i=0; i< howmany ; i++)
        {
            tobereturn.push(this.letters.pop());
        }
        return tobereturn;
    }
}
