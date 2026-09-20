import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;


public class demo5 {
    public static void main(String args[])
    {
        List<Integer> numbers=Arrays.asList(1,56,45,34,67,22,34,11,84,43,222);

        // anonymous class

        Predicate<Integer>greater=new Predicate<Integer>() {
            public boolean test(Integer n)
            {
                return n>50;
            }
        };
        numbers.stream().filter(greater).forEach(n->System.out.println(n+" "));
    }
    
}
