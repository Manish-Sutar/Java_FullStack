class a
{
    static void display()
    {
        System.out.println("hello from class A");

    }
    void show()
    {
        System.out.println("its show method");

    }
}




public class nonstatic {
    public static void main(String args[])
    {
        a.display();
        a obj = new a();
        obj.show();
    }
    
}
