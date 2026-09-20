import java.util.Scanner;

public class atm
{
    // atm code

    
    double balance =1000;
    int pin =1234;


     void checkbalance()
    {
        System.out.print("enter your pin");
        Scanner sc = new Scanner(System.in);
        int pin1 = sc.nextInt();

        if(pin==pin1)
        {   
        System.out.println("your balance is "+balance);

        }
    }

     void addmoney(double bal)
    {
        balance=+bal;
        System.out.println("deposite successfully");
        System.out.println("your balance is "+balance);
    }


    void withdraw(double bal,int pin1)
    {
        if(pin==pin1)
            {

        
            if(bal<=balance)
            {
                balance-=bal;
                System.out.println("withdraw successfully");
                System.out.println("your balance is "+balance);
            }
            else
            {
                System.out.println("insufficient balance");
            }

        }
    
       else
    {
        System.out.println("invalid pin");
    }

    }
    
    void changepin()
   
    {
     System.out.println("please enter you old pin");
     Scanner sc = new Scanner(System.in);
     int pin2 = sc.nextInt();

     if(pin==pin2)
     {
       System.out.println("enter your new pin");
       Scanner sc1 = new Scanner(System.in);
       int pin3 = sc1.nextInt();
       pin=pin3;

       System.out.println("pin changed successfully");
     }
     else
     {
        System.out.println("invalid pin");
     }
     

    }
}


    
 

    
    