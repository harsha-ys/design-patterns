import java.util.ArrayList;
public class Stockgrabber 
{
    private ArrayList< Observer > Observers;
    private double aappleprice;
    private double hpprice;
    private double dellprice;

    public Stockgrabber()
    {
        Observers = new ArrayList<Observer>();
    }
    public void register(Observer newobserver)
    {
        Observers.add(newobserver);
    }
    public void unregister(Observer tobedeleted)
    {
        int index = Observers.indexOf(tobedeleted);
        System.out.println("The observer "+ (index+1) + " will be deleted");
        Observers.remove(index);
    }
    public void notifyobserver()
    {
        for(Observer observer : Observers) observer.update(aappleprice, hpprice, dellprice);
    }
    public void setappleprice(double newappleprice)
    {
        this.aappleprice = newappleprice;
        notifyobserver();
    }
    public void sethpprice(double newhpprice)
    {
        this.aappleprice = newhpprice;
        notifyobserver();
    }
    public void setdellprice(double newdellprice)
    {
        this.aappleprice = newdellprice;
        notifyobserver();
    }
}
