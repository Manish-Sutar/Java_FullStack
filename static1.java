class Bank {
    private double bal = 1000;

    public void balance() {
        System.out.println("Current balance is: $" + bal);
    }

    public void deposit(double dep) {
        if (dep > 0) {
            bal += dep;
            System.out.println("Amount deposited successfully.\nCurrent balance is: $" + bal);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double withdrawal) {
       
        if (withdrawal <= bal) {
            bal -= withdrawal;
            System.out.println("Balance withdrawn successfully.\nCurrent balance is: $" + bal);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class ATM {
    Bank b = new Bank();

    void show() {
        b.deposit(100);
    }
}

public class static1 {
    public static void main(String[] args) {
        Bank b2 = new Bank();
        
        b2.balance();
        b2.deposit(500);
        b2.withdraw(300);  
        b2.withdraw(2000);  
    }
}