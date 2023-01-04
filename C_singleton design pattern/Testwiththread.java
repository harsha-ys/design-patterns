public class Testwiththread 
{
    public static void main(String[] args) 
    {
        Runnable gettilesfirst =  new Gettilewiththread();
        Runnable gettilessecond =  new Gettilewiththread();
        
        new Thread(gettilesfirst).start();
        new Thread(gettilessecond).start();
    }
}
