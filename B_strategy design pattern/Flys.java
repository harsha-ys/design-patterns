public interface Flys 
{
    String Fly();    
}

class ItFlys implements Flys
{
    public String Fly()
    {
        return "I can fly";
    }
}

class CantFly implements Flys
{
    public String Fly()
    {
        return "I can not fly";
    }   
}
