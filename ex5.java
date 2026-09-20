interface BankAccount
{
    void deposite(double amount);
    void withdrawal(double amount);
    default void accountType()
    {
        System.out.println("Saving Account");
    }
}

public class ex5 {
    public static void main(String args[])
    {

    // creating the annouomance class
    BankAccount obj1 = new BankAccount() {
        public void deposite(double amount)
        {
            System.out.println("amount is deposited"+amount);
        }
        public void withdrawal(double amount)
        {
            System.out.println("withdrawal is done"+amount);
        }
       
    };
     obj1.accountType();
        obj1.deposite(1000);
        obj1.withdrawal(500);
}
}
