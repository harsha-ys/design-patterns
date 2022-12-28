
public class Stockobserver implements Observer {
    private double appleprice;
    private double hpprice;
    private double dellprice;

    private static int allobserveridtrack = 0;
    private int observerid ;
    private Subject stockgrabber;
    
    public Stockobserver(Subject stockgrabber)
    {
        this.stockgrabber = stockgrabber;
        observerid = ++allobserveridtrack;
        System.out.println("new observer ID will be "+ observerid);
        this.stockgrabber.register(this);
    }
    public void update(double appleprice, double hpprice, double dellprice)
    {
        this.appleprice = appleprice;
        this.hpprice = hpprice;
        this.dellprice = dellprice;

        displayprices();
    }
    public void displayprices()
    {
        System.out.println("observer "+observerid + "\napple price " + appleprice+"\nhp price "+hpprice+"\ndell price "+dellprice);
    }
    
}
