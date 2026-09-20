abstract class vehicle 
{
    abstract void start();
    abstract void stop();

    void fuelType()
    {
        System.out.println("fuel type is petrol");
    
    }
}
public class ex6 {
    public static void main(String args[])
    {
        vehicle obj = new vehicle() {
            public void start()
            {
                System.out.println("vehicle is started");
            }
            public void stop()
            {
                System.out.println("vehicle is stopeed");
            
            }
        };
        obj.fuelType();
        obj.start();
        obj.stop();

    }
    
}

