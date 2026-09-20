import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class demo6
{
  public static void main(String args[])
  {
    List<Integer>list=Arrays.asList(2,3,4,6,7,8,12,11);

    // even number
System.out.println("even number");
    list.stream().filter(n->n%2==0).forEach(n->System.out.print(n+ " "));

    System.out.println("odd number");
    list.stream().filter(n->n%2==1).forEach(n->System.out.print(n+ " "));

    System.out.println("multipication  number by 2 in the list");

    list.stream().map(n->n*2).forEach(n->System.out.println(n +" "));


     // reduce method through the binary 
     System.out.println("    ");
    int sum=list.stream().reduce(0,(a,b)->a+b);
    System.out.println(sum);

    // BiFunction <Integer , Integer, Integer>bi=(a,b)->a+b;

    // binary operator

    BinaryOperator<Integer> bi=(a,b)->a*b;
    int result2 = list.stream().reduce(1,bi);
    System.out.println(result2);

    // stream method

    // sequential stream - one time one
    // parallelstream  - simutel  


    
  }
}