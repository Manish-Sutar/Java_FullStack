class Printvalue extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (Exception e) {
               
            }
        }
    }
}
class Printvalue2 extends Thread
{
    public void run()
    {
        for(int i=11;i<20;i++)
        {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (Exception e) {
               
            }
        }
    }
}
public class thread2 {
    public static void main(String args[])
    {
        // Runnable run=()->
        // {
        //     for(int i=0;i<10;i++)
        // {
        //     try {
        //         Thread.sleep(100);
        //         System.out.println(i);
        //     } catch (Exception e) {
               
        //     }
        // }
       
        // };
        //  Thread t =new Thread();
        // t.start();

        Printvalue val = new Printvalue();
        Printvalue2 val2= new Printvalue2();
        val.start();
        val2.start();


    }
    
}
