import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class demo
{
    int id;
    String name;
    int sal;
    // public demo()
    // {

    // }
    public demo(int id,String name,int sal)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
}
public class ArrayLis {
    public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(12,42,45,67,23,98);
//         for(Object i:list)
//         {
// System.out.println((Integer)i);
//         }

//         Collections.sort(list);
//         System.out.println(list);

//         List<String>list2=Arrays.asList("abc","raj","shyam");
//         for(String i:list2)
//         {
//             System.out.println(i);
//         }

List emp=new ArrayList<>();
emp.add(new demo(300,"raj",11000));
emp.add(new demo(200,"shyam",21000));
emp.add(new demo(400,"ram",1000));
emp.add(new demo(500,"jay",99900));

// Comparable com =new Comparable<T>() {
//     public int compareTO(demo that)
//     {
//        if(this.id>that.id)
//        {
//         return 1;
//        }else
//        {
//         return -1;
//        }
//     }

// };
for(int i=0;i<emp.size();i++)
{
    System.out.println(emp)
}
  }
}
