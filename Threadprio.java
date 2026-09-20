class A extends Thread
{
    public void run()
{
    for(int i=1;i<=10;i++)
    {
        System.out.println(i);
        System.out.println("Thread from A class");
    }
}
}
class B extends Thread
{
    public void run()
{
    for(int i=11;i<=20;i++)
    {
        System.out.println(i);
         System.out.println("Thread from B class");
    }
}
}
class C extends Thread
{
    public void run()
{
    for(int i=21;i<=30;i++)
    {
        System.out.println(i);
         System.out.println("Thread from c class");
    }
}
}
public class Threadprio
{
public static void main(String [] args)
{
    A a=new A();
    B b=new B();
    C c=new C();
    
      a.setPriority(10);
      b.setPriority(5);
      c.setPriority(1);
      //starting the thread
      
      a.start();
     b.start();
      c.start();
     
    //    try {
    //     a.join();
    //     b.join();
    //     c.join();
    //   } catch (Exception e) {
       
    //   }

     
}

}