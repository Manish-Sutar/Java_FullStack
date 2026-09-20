import java.util.*;
import java.util.function.Consumer;

public class collection1 {
    public static void main(String[] args) {

        List list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add("hello");
        list.add(true);
        list.add(23.54);
        list.add('c');

        System.out.println(list);

        int res = (int) list.get(1);
        System.out.println(res);

        String str = (String) list.get(4);
        System.out.println(str);

        // Normal for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Enhanced for loop
        for (Object val : list) {
            System.out.println(val);
        }

        // Add 80 at index 2
        list.add(2, 80);

        System.out.println(list);

         list.add(1000) ;

        System.out.println(list);
        boolean b=list.contains(2000);
        System.out.println(list.contains(1000));
        list.add(Integer.valueOf(30));
        list.contains(Integer.valueOf(50));
    //   Consumer consumer = new Consumer<>() {
    //     public void accept(Object a)
    //     System.out.println(a)
    //   };
    //     list.forEach(action);

    list.forEach((Object o)->System.out.println(o));

    int size=list.size();
    System.out.println(size);

   Object obj= list.getFirst();
   System.out.println(obj);
   
   System.out.println(list.getLast());

   int hashcode = list.hashCode();
   System.out.println(hashcode);

   boolean check =list.isEmpty();
   System.out.println(check);

   System.out.println(list.indexOf(10));

   list.remove(10);

   System.out.println(list);
   list.remove("hello");
   System.out.println(list);

   list.clear();
  
   

    }
}