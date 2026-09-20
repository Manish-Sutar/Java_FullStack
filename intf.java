interface payment
{
    void pay();
}
class upi implements payments
{
    public void pay()
    {
        System.out.println("paid by upi ");
    }
}
class Card implements payments
{
    public void pay()
    {
        System.out.println("paid by upi");
    }
}

public class intf {
    public static void main(String args[])
    {
        
    }
}
