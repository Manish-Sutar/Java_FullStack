class bank
{
    void Bank(int amount) throws Exception
    {
        System.out.println("bank server is connecting");
        Atm(amount);
    }
    void Atm(int amt) throws Exception
    {
        System.out.println("Atm is processing");
        withDraw(amt);
    }
    void withDraw(int amt) throws Exception{
        System.out.println("amount withdrawal is done");
    }
}

public class exception2 {
    public static void main(String[] args) {
        bank b1=new bank();
        try
        {
            b1.Bank(3000);

        }
        catch(Exception e)
        {
            System.out.println("its handing the error");
        }
    }
    
}
