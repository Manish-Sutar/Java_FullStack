// import java.util.Scanner;

class order extends Exception
{
    public void placeOrder() throws Exception
    {
        System.out.println("please order");
    }
    order(String msg)
    {
        super(msg);
    }   
}
class OrderExc extends Exception
{
  int stock =5;

  void placeOrder(int quantity) throws order{
    if(quantity>stock)
    {
        throw new order("product out of the stock");
    }
    stock =stock -quantity;
    System.out.println("order placed successfully");
    System.out.println("remaining stock"+stock);
  }
}

public class orderExp {
    public static void main(String[] args) {
        OrderExc obj = new OrderExc();

        try
        {
            System.out.println("Available stock are "+obj.stock);
            System.out.println("requested quantity :8");
            obj.placeOrder(8);
        }
        catch(order e)
        {
            System.out.println(e.getMessage());
        }


    }
    
}
