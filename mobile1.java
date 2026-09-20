class Reacharge1 extends Exception
{
    Reacharge1(String msg)
    {
        super(msg);
    }
}
class Reacharge
{
    void reacharge(double amt,int mobile) throws Reacharge1
    {
        
        if(amt>0)
        {
            System.out.println("please continued for recharge");
        }
        else 
            throw new Reacharge1("amt is less than zero ");
    }
}
public class mobile1 {
    public static void main(String args[])
    {
        recharge obj = new reacharge();

        try
        {
            System.out.println("hello from try blocks");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
