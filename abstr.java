abstract class car
{
    abstract void carcost();

    void show()
    {
        System.out.println("details of car");
    }
}
class honda extends car
{
    void carcost()
    {
        System.out.println(" this is car cost");
    }
}
class audi extends car
{
    void carcost()
    {
        System.out.println(" this is audi car");
    }
}


public class abstr {
    public static void main(String args[])
    {
car Honda = new honda();
car Audi = new audi();
Audi.carcost();
Honda.carcost();
    }
}
