import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.*;

public class demo2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 44, 7, 18, 91);

        
        // WITHOUT USING STREAM API
       

        List<Integer> listeven = new ArrayList<>();

        for (Integer val : list) {
            if (val % 2 == 0) {
                listeven.add(val);
            }
        }

        System.out.println("Even numbers without Stream: " + listeven);


       
        // USING STREAM API - EVEN NUMBERS
       

        List<Integer> streameven = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Even numbers using Stream: " + streameven);


       
        // USING STREAM API - ODD NUMBERS
        

        List<Integer> streamodd = list.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println("Odd numbers using Stream: " + streamodd);


       
        // PRINT EVEN NUMBERS IN SINGLE LINE
       

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();


        
        // PREDICATE + CONSUMER + STREAM
        

        Predicate<Integer> p = a -> a % 2 == 1;

        Consumer<Integer> com1 = a -> System.out.print(a + " ");

        list.stream()
                .filter(p)
                .forEach(com1);

        System.out.println();
    }
}
