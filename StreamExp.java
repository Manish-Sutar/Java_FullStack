import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.stream.*;

public class StreamExp {
    public static void main(String args[])
    {
        List<Integer>list =Arrays.asList(12,34,65,11,78,88,74,03,66);
         List <Integer>StreamEven=new ArrayList<>();

        // using stream
      Stream<Integer>stream=  list.stream();
         Predicate <Integer>p= a->a%2==0?true:false;
      streamEven1=stream.filter(p).toList();
      System.out.println(streamEven1);



    }
    
}
