public class Enemyship 
{
    private String name;
    enemyshipweapon weapon;
    enemyshipengine engine;

    public void setname( String name) {this.name = name;}
    public String getname(){return this.name;}

    abstract void makeship();

    public void followhero()
    {
        System.out.println( name  + " follow the hero ship using " + engine);
    }
    public void diplsyenemyship()
    {
        System.out.println(name + " is now in the battle field");
    }
    public void shoots()
    {
        System.out.println(name + " attacks and does " + weapon);
    }

    public String tostring()
    {
        return "The "+name+" has a top speed of "+engine+" and attack power of "+ weapon;
    }
}
