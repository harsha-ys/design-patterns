public class Animal
{
    private String sound;
// Instead of using an interface in a traditional way
// we use an instance variable that is a subclass
// of the Flys interface.

// Animal doesn't care what flyingType does, it just
// knows the behavior is available to its subclasses

//This is known as Composition : Instead of inheriting
// an ability through inheritance the class is composed
// with Objects with the right ability
 
// Composition allows you to change the capabilities of
// objects at run time!

    public void setsound( String sound ) 
    {
        this.sound = sound;
    }
    public static void main(String[] args) {
        Animal xx =new Animal();
        xx.setsound("cat and dog");
        System.out.println(xx.sound);

    }
        

}
