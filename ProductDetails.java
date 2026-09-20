import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;


class product {
    int id;
    String name;
    int price;
    int rating;
    int stock;

    product(int id, String name, int price, int rating, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    // toString method
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nproduct ");
        sb.append("id ").append(id);
        sb.append(" name ").append(name);
        sb.append(" price ").append(price);
        sb.append(" rating ").append(rating);
        sb.append(" stock ").append(stock);

        return sb.toString();
    }
}

public class ProductDetails {

    public static void main(String[] args) {

        List<product> items = new ArrayList<>();

        items.add(new product(2, "bag", 4500, 5, 10));
        items.add(new product(3, "mobile", 15000, 4, 10));
        items.add(new product(4, "Tv", 18000, 4, 100));
        items.add(new product(6, "watch", 1000, 4, 15));
        items.add(new product(7, "clothes", 1800, 3, 100));
        items.add(new product(3, "mobile", 15000, 4, 10));
        items.add(new product(9, "ring", 15000, 5, 10));
        items.add(new product(10, "smarttv", 35000, 4, 30));

        System.out.println("Before sorting:");
        System.out.println(items);

       


        
// SORT NAME IN ASCENDING ORDER USING ANONYMOUS CLASS
Comparator<product> com = new Comparator<product>() {
    public int compare(product a, product b) {
        if(a.stock>b.stock)
        {
            return 1; // swapped
        }
        else
        {
            return -1;//not swapped
        }
    }
};
Collections.sort(items,com);


System.out.println("\nName Ascending - Anonymous Class:");
System.out.println(items);

// lamda expression
System.out.println("\n \n hello ");

Collections.sort(sk,(a,b)->Integer.compare(b.rating,a.rating));

Collections.sort(items,sk)
System.out.println(items);


    
}
}