

interface Greeting {
    void greet();
}

public class lam1 {
    public static void main(String[] args) {

        Greeting g = () -> {
            System.out.println("Welcome to Java");
        };

        g.greet();
    }
}