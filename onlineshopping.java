class product
{
    private int id;
    private String name;
    private int price;
}
product(int id, String name, int price)
{
    this.id=id;
    this.name=name;
    this.price=price;
}
public int getid()
{
    return id;
}
public String getname()
{
    return name;
}
public int getprice()
{
    return price;
}
public double calculateDiscount()
{
    return price;
}
public String toString
{
    return "id is"+id+"price is"+price+"discount is "+calculateDiscount();
}
public boolean equal(product p)

{
  return this.id==p.id;
}

class electronic extends product
{
    electronic(int id, String name, int price)
    {
        super(id,name,price);
    }
    public double calculateDiscount()
    {
        return getprice()*0.90;
    }
}
class clothing extends product
{
   clothing(int id, String name, int price)
    {
        super(id,name,price);
    }
    public double calculateDiscount()
    {
        return getprice()*0.90;
    }
}
class grocery extends product
{
   grocery(int id, String name, int price)
    {
        super(id,name,price);
    }
    public double calculateDiscount()
    {
        return getprice()*0.90;
    }
}

public class onlineshopping {
    public static void main(String args[])
    {
        product[] products=new product[3];
        products [0]=new electronic(1,"ac",50000);
        products [1]=new clothing(2,"t-shirts",50);
        products [2]=new grocery(3,"k",5000);

        


    }
}
