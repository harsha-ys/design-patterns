public abstract class Enemyship
{
    private String name;
    private double amtdamage;

    public String getname(){return name;}
    public void setname(String name){ this.name = name;}

    public double getdamge(){return amtdamage;}
    public void setdamage(double amtdamage){this.amtdamage = amtdamage;}

    public void followheroship()
    {
        System.out.println(getname() + " is now following the Hero");
    }

    public void displayenemyship()
    {
        System.out.println(getname() + " is on the field");
    }

    public void enemyshipshoots()
    {
        System.out.println(getname() + " attack and does "+getdamge()+" to hero");
    }

}
