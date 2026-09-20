abstract class vehicle
{
    abstract void speed();

    void show()
    {
        System.out.println("speed of vehicle");
    }
}
class car extends vehicle
{
    public void speed()
    {
        System.out.println("car speed is slow");
    }
}
class bike extends vehicle
{
    public void speed()
    {
        System.out.println("speed of bike is fast");
    }
}
public class ex
{
    public static void main(String args[])
    {
        vehicle bike1=new bike();
        vehicle car1=new car();
        car1.speed();
        bike1.speed();
    }
}