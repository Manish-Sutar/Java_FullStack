class A implements Runnable
{
 public void run()
 {
    for(int i=0;i<10;i++)
    {
       try{
        Thread.sleep(100);
        System.out.println(i);
       }
       catch(Exception e)
       {

       }
    }
 }
}


public class multiplethread {
    public static void main(String[] args) {
        A a = new A();
        Thread t= new Thread(a);
        t.start();
    }
}
