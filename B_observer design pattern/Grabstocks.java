public class Grabstocks 
{
    public static void main(String[] args) 
    {
        Stockgrabber stockgrabber = new Stockgrabber();
        Stockobserver observer1 = new Stockobserver(stockgrabber);
        stockgrabber.setappleprice(123000);
        stockgrabber.sethpprice(200000);
        stockgrabber.setdellprice(300000);

        Stockobserver observer2 = new Stockobserver(stockgrabber);
        stockgrabber.setappleprice(3000);
        stockgrabber.sethpprice(2000);
        stockgrabber.setdellprice(3002);
        
    }    
}
