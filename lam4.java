interface number
{
    void check(int number);
}
public class lam4 {
    public static void main(String args[])
    {
        number obj = number->
        {
            if(number%2==0)
                System.out.println("number is even");
            else
                System.out.println("number is odd");

        };
        obj.check(20);
    }
    
}
