import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class demo3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 44, 7, 18, 91);

    Stream<Integer>stream=numbers.stream();
    stream.forEach(n->System.out.println(n));

    // even numbers

    numbers.stream().filter(a->a%2==0).forEach(n->System.out.println(n));

    

    // without using
    List<Integer>mul = new ArrayList<>();

    for(Integer num:numbers)
    {
        mul.add(num*2);
    }
    System.out.println("without using stream api"+mul);
    

    // modify the value for map() use stream

   numbers. stream().map(a->a*2).forEach(n->System.out.println(n +" "));
// lamda expression

 Function <Integer,Integer>fun=a->a*2;

 // anonymous class
 Function <Integer,Integer>fun2=new Function<Integer,Integer>() {
    public Integer apply(Integer a)
     {
        return a*2;
     }
  
 };
 numbers.stream().map(fun2).forEach(n->System.out.println(n+" "));



 // multiply by 3 
 System.out.println("mult 3");
 Function<Integer,Integer>fun3=new Function<Integer , Integer>() {
   public Integer apply(Integer a)
   {
    return a*3;
   }
 }; 

 numbers.stream().map(fun3).forEach(n->System.out.println(n + " "));

 // number is greater than 50;

 









    }
}
