interface Maximum {
    int find(int a, int b);
}

public class lam3 {
    public static void main(String[] args) {

        Maximum obj = (a, b) -> (a > b) ? a : b;

        System.out.println("Maximum is " + obj.find(10, 20));
    }
}