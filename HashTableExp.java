import java.util.Hashtable;
import java.util.Map;

public class HashTableExp {
    public static void main(String[] args) {
        Map map2 = new Hashtable<>();
        map2.put("rohit",65);

        map2.put("raj",66);
        map2.put("patil",67);

        map2.put("sumit",88);

        map2.put("Manish",90);
       // map2.put(null,99);
        System.out.println(map2);
      
      boolean checkkey=  map2.containsKey("rohit");
      System.out.println(checkkey);

      // 
      boolean checkval=  map2.containsKey(500);

      System.out.println(checkval);


    }
}
