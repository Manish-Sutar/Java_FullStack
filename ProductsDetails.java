

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

import java.util.Collections;

class Products implements Comparable<Products>
{
    int id;
    String name;
    int price;
    int stock;
    int rating;

    public Products(int id, String name, int price, int rating, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Products{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }
    public int compareTo(Products that)
    {
        if(this.id>that.id)
        {
            return 1;
        }
        else{
            return -1;
        }
    }
  
}

public class ProductDetails {
    public static void main(String[] args) {
        // List<Products> items=new ArrayList<>();
        // items.add(new Products(2, "Bag", 600, 7, 10));
        // items.add(new Products(1, "Bottle", 200, 9, 2));
        // items.add(new Products(4, "Watch", 2000, 8, 15));
        // items.add(new Products(3, "Mobile", 30000, 9, 20));
        // items.add(new Products(6, "Pen", 60, 7, 30));
        // items.add(new Products(5, "Umbrella", 200, 6, 1));
        // items.add(new Products(8, "Toy-car", 10000, 3, 5));
        // items.add(new Products(7, "Smart TV", 12000,4 , 20));

        // Collections.sort(items);

        // for(Object val:items)
        // {
        //     System.out.println(val);
        // }

        // // lamda expression
        // Collections.sort(items,(p1,p2)->
        //   p1.name.compareTo(p2.name));



          // 
          List<Integer> numbers =Arrays.asList(2,3,4,5,6,7,8,9,12,34);

          List<Integer> even =new  ArrayList<>();
          List<Integer>odd = new ArrayList<>();

          for(Integer num:numbers)
          {
            if(num%2==0)
            {
                even.add(num);
            }
          
            else
          {
            odd.add(num);
          }
        }

        System.out.println("print even Numbers");
        for(Integer n:even)
        {
            System.out.println(n);
        }
        System.out.println("");

        System.out.println("print odd Numbers");
        for(Integer o:odd)
        {
            System.out.println(o);
        }

        List listmul = new ArrayList<>();
        for(Integer n:numbers)
        {
            listmul.add(n*2);
        }
        System.out.println("multipication  Numbers");
        for(Integer n:listmul)
        {
            System.out.println(n);
        }






        

  
    }

}