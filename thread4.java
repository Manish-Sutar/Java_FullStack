// bank thread

import java.net.SocketPermission;

class Atm extends Thread
{
    String msg;
     int balance=200;
    Atm(String msg,int amount)
    {
        this.msg=msg;
        this.balance=amount;
    }
  
   synchronized void deposite(int amount)
    {
      System.out.println("amount credited successfully"+amount);
      balance+=amount;
      System.out.println("your balance is"+balance);
    }
   synchronized void withDraw(int amount)
    {
        System.out.println("amount debited successfully"+amount);

      balance-=amount;
       System.out.println("your balance is"+balance);
    }
}
class User extends Thread
{
    String msg;
    int balance=1500;
    Atm atm;
    User(String msg,int balance, Atm atm)
    {
        this.msg=msg;
        this.balance=balance;
        this.atm=atm;
    }
    public void run()
    {
        if(msg=="deposite")
        {
            atm.deposite(balance);
        }
        else if(msg=="withdraw")
        {
            atm.withDraw(balance);
        }
        else
        {
            System.out.println("wring operation");
        }
    }
}


public class thread4 {
    public static void main(String args[])
    {
        Atm atm=new Atm("withdraw",1500);
        User User1=new User("withdraw",1500,atm);
         User User3=new User("deposite",1500,atm);
        User User2=new User("withdraw",1500,atm);
        // atm.deposite(1000);
        // atm.withDraw(500);
        User1.start();
        User2.start();
        User3.start();
        try {
            User1.join();
            System.out.println(User1.getState());
            User2.join();
             System.out.println(User2.getState());
            User3.join();
             System.out.println(User3.getState());
        } catch (Exception e) {
           System.out.println("handled");
        }



    }
}
