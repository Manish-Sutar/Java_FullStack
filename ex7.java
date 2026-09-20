interface Employee
{
    void takeBreak();
    void work();
    default void officeTiming()
    {
        System.out.println("office Timing is 9 AM to 6 pm");
    }
}

public class ex7 {
    public static void main(String args[])
    {
        // using anonymous class
        Employee obj = new Employee() {
            public void work()
            {
                System.out.println("work is started");
            }
            public void takeBreak()
            {
                System.out.println("its Break time");
            }
        };
        obj.officeTiming();
        obj.work();
        obj.takeBreak();
    }
}
