interface addition
{
    int add(int a, int b);
}

public class lam2 {
    public static void main(String args[])
    {
        // through lamda expression

        addition obj =(a,b)->
        
            a+b;
        
        
           
        
        System.out.println("Addition is "+obj.add(10,20));
    }
    
}
