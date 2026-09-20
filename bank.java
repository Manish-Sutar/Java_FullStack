
class customer
{
    double bal=1000;
        int ac;

        void deposite(int balance)
        {
           bal+=balance;
           System.out.println("balance is deposited");
           System.out.println("balance is "+bal);

        }
        void withdrawal(int with)
        {
            if(bal<with)
                {
                    System.out.println("insufficient balance");
                }
             else
                {
                    bal-=with;
                    System.out.println("withdrawal is done");
                }    
        }
}
public class bank {
    public static void main(String args[])
    {
        customer ct = new customer();
        ct.deposite(100);

    }
}
