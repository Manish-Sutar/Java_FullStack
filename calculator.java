import java.util.Scanner;

public class calculator {
    
    static void add(int a, int b)
    {
        System.out.println("Sum: " + (a + b));
    }
  static void sub(int a, int b)
    {
        System.out.println("Sub: " + (a - b));
    }
    static void mul(int a, int b)
    {
        System.out.println("Mul: " + (a * b));
    }
    static void div(double a, double b)
    {
        System.out.println("Div: " + (a / b));
    }
    public static void main(String args[])
    {

    System.out.println("what do you want performe \n 1 add \n 2 sub \n 3 mul \n 4 div");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
                System.out.println("enter 1 digit ");
            Scanner Sc = new Scanner(System.in);
            int a = Sc.nextInt();
            System.out.println("enter 2 digit ");
            Scanner Sc1 = new Scanner(System.in);
            int b = Sc1.nextInt();

    

    switch(choice)
    {
        case 1:

            add(a,b);
            break;
            
            case 2:
                
            sub(a,b);
            break;

            case 3:
                mul(a,b);
                break;

                case 4:
                    div(a,b);
                    break;

                default:
                    System.out.println("invalid input");
                    break;

    }



            
    }



    }
 

