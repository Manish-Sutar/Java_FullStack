class payment
{
    void pay1()
    {
        System.out.println("do payment");
    }
}
class upi extends payment
{
    void pay1()
    {
        
        System.out.println("pay theough Upi ");
    }
}
class card extends payment
{
   void pay1()
   {
    
    System.out.println("Pay throgh the card");
   }
}
class netbanking extends payment
{
    void pay1()
    {
        super.pay1();
        System.out.println("pay throguh netbanking ");
    }
}


public class pay {
    public static void main(String args[])
    {
    netbanking obj = new netbanking();
    obj.pay1();
    }

    
}
