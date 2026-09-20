class Counter
{
    int count=0;
   synchronized void increament()
    {
        count++;
    }
}
class Mythread extends Thread{
    Counter counter;
    public Mythread(Counter counter)
    {
        this.counter=counter;
    }
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
           counter.increament();
        }
    }
}

public class thread3 {
    public static void main(String[] args) {
        Counter counter =new Counter();
        Mythread mythread=new Mythread(counter);
         Mythread mythread2=new Mythread(counter);
        mythread.start();
        mythread2.start();
        try {
            mythread.join();
            mythread2.join();
        } catch (Exception e) {
           e.printStackTrace();
        }


        System.out.println(counter.count);
        System.out.println(counter.count);
        System.out.println(counter.count);
        System.out.println(counter.count);
        System.out.println(counter.count);
    }
}
