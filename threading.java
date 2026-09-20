class A extends Thread
{
   public void run()
    {
      for(int i=0;i<10;i++)
      {
       try {
        Thread.sleep(1000);
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println("handle");
       }
      }
    }
}
public class threading {
    // demo thread program
    public static void main(String[] args) {
        // Thread t =new Thread();
        // new runnable - running wait terminated
        // System.out.println(t.getState());
        // t.start();

        // System.out.println(t.getState());

       A a=new A();
       a.setName("A1 class thread");
       a.start();
        System.out.println(a.getName());
       Thread t =new Thread();
       // getting the name of thread
       // threadid,thread priority
      
      
       System.out.println(t.getName());
       System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        // termin
        
    }
    
}
