abstract class Animal
{
    abstract void MakeSound();
    void eat()
    {
        System.out.println("Animal is Eating");
    }
}

public class ex4 {
    public static void main(String args[])
    {
        Animal dog = new Animal() {
            void MakeSound()
            {
                System.out.println("dog bark ");
            }
        };
    
    dog.eat();
    dog.MakeSound();
    }
    
}
