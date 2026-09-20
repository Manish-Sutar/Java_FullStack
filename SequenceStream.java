import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;


public class SequenceStream {
    public static void main(String[] args) {
        
        int size = 10000;

        List<Integer> numbers= new ArrayList<>(size);

        Random random = new Random();
        for(int i =0; i<size;i++)
        {
            numbers.add(random.nextInt(100));
        }
        // printig 
        // for(Integer val:numbers)
        // {
        //     System.out.println(val);
        // }
         

     long seqStart =   System.currentTimeMillis();
      long result =  numbers.stream().map(n->n*2).mapToInt(n->n).reduce(0,(a,b)->a+b);
        
     long seqEnd =   System.currentTimeMillis();
     System.out.println(result);
     System.out.println("squ stream time"+(seqStart-seqEnd));

     long parStart =   System.currentTimeMillis();
      long result2 =  numbers.stream().map(n->n*2).reduce(0,(a,b)->a+b);
        
     long parEnd =   System.currentTimeMillis();
     System.out.println(result+" "+result2);
     System.out.println("squ stream time"+(seqStart-seqEnd));
      System.out.println("parallel stream time"+(parStart-parEnd));

    }
}
