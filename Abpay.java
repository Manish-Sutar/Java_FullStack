abstract class payments
{
    abstract void pay();

    void show()
    {
        System.out.println("paymnet is done");
    }
}
class upi extends payments{
    void pay()
    {
        System.out.println("payments by upi ");
    }
}
class card extends payments
{
    void pay()
    {
        System.out.println("paid through card");
    }
}




public class Abpay {
    public static void main(String args[])
    {
        payments obj1 = new card();
        payments obj22 = new upi();
        obj1.pay();
        obj22.pay();
    }
}
