class a
{
    void demo()
    {
        System.out.println(" hello from class A");
    }
    void displayed()
    {
        System.out.println("displayed from class a");
    }
}
class b extends a
{
    void demo()
    {
        System.out.println("hello from class b");
    }
}

public class inheritance {
    public static void main(String args[])
    {
        b obj1 = new b();
        obj1.demo();
        obj1.displayed();

    }
}
