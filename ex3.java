interface Greeting
{
    void greet();
    default void WelecomeMessage()
    {
        System.out.println("welcome user");
    }
}
public class ex3 {
    public static void main(String args[])
    {
        Greeting g = new Greeting() {
          
            public void greet()
            {
                System.out.println("hello user");
            }
        };
        g.WelecomeMessage();
        g.greet();
    }
    
}
