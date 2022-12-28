public class Demo 
{
    public static void main(String[] args) 
    {
        Animal bruuna = new Dog();
        Animal girawa = new Bird();

        System.out.println("bruuna is a dog and can it fly ? " + bruuna.Trytofly());
        System.out.println("girawa is a bird and can it fly ? " + girawa.Trytofly());
    }
}
