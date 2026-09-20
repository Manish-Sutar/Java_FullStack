import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.stream.*;


public class demo1
{
public static void main(String[] args) {
    List<Integer>list=Arrays.asList(1,2,3,4,5,44,7,18,91);

    // without using stream api

    List <Integer>listeven= new ArrayList<>();
    for(Integer val:list)
    {
        if(val%2==0)
        {
            listeven.add(val);
        }
    }

    System.out.println("even number without using stream  "+listeven);


// using stream
   Stream<Integer>streamList= list.stream();
   List<Integer>streameven=new ArrayList<>();



   

   streameven=streamList.filter(n->n%2==0?true:false).toList();

   System.out.println(streameven);

   // odd number
   list<Integer>streamodd=new ArrayList<>();

   streamodd=streamList.filter(n->n%2==0?true:false).toList();
   System.out.println(streamodd);


  
   // odd number using stream
    // List<Integer>streamOdd=new ArrayList<>();
    // Stream<Integer>odd=list.stream();
    // odd.filter(n->n%2==1).toList();
    // System.out.println("priting odd number filter "+streamOdd);


    // print even  number to sing le line

    // list.stream().filter(n->n%2==0).forEach(n->System.out.println(n +""));

    // Predicate<Integer>p2=a->a%2==1;
    // Consumer<Integer>con =a->System.out.println(a +" ");
    // list.stream().filter(p2).forEach(con);


    Predicate<Integer> p= a->a%2==1;
    Consumer<Integer>com1 =a->System.out.println(a +" ");
    list.stream().filter(p).forEach(com1);
   
}
}