
import java.util.Arrays;

public class str {
    public static void main(String args[])
    {
        String name= new String("abc");
        String name2 = "user";
        String name3="abc";
        String name4="abc";
        System.out.println(name2==name);// false
        System.out.println(name3==name4);// true

        System.out.println(name4.toUpperCase());//ABC

         name = name+"manish";
         System.out.println(name.toString());
         System.out.println(name3.equals(name4));
        System.out.println(name2.compareTo(name4));
        System.out.println(name3.toLowerCase());
        System.out.println(name3.toUpperCase());
        System.out.println(name3.charAt(0));
        
        String demo []= new String [5];
        demo[0]="user1";
        demo[1]="user2";
        System.out.println(Arrays.toString(demo));

        String test ="this: is demo :String";
        String arr[]=test.split(":");
        System.out.println(Arrays.toString(arr));

        





    }
    
}