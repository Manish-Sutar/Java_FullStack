import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapExp {
    public static void main(String args[]) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "raj");
        map.put(2, "ram");
        map.put(null, "rohit");
        map.put(null, "shyam");

        System.out.println(map);

        System.out.println(map.get(null));
        System.out.println(map.get(2));

        // Get all keys
        Set<Integer> set = map.keySet();

        for (Integer set2 : set) {
            System.out.println(set2);
        }

        // Get all values
        for (String k : map.values()) {
            System.out.println(k);
        }
        // //anonynous class example
        // Bisconsumer <Integer,String>bi = new Bisconsumer<>()
        // {
        //     public void accept(Integer a,String b)
        //     {
        //         System.out.println("hello");
        //     }
        
        // };

        // lamda expression
        
        BiConsumer <Integer,String> bi2=(Integer a, String b)->{
            System.out.println("hello");
        };
        // map.forEach(bi);
    }
}