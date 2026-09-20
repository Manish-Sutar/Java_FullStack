import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorEx {
  public static void main(String args[])
  {
    List <Integer> list =Arrays.asList(23,43,12,54,32,65,41);
     System.out.println("original  array");
    System.out.println(list);
    Collections.sort(list);

     System.out.println("sorted array"+list);

     Comparator<Integer> com =new Comparator<>()
     {
        public int compare(Integer a, Integer b)
        {
            if(a%10>b%10)
                {
                    //swapped 
                    return 1;
                } 
            else
            {
                //not swapped
                return -1;
            }
        }
     };
     Comparator<Integer> desc=new Comparator<>()
     {
        public int compare(Integer a, Integer b)
        {
            if(a%10>b%10)
                {
                    //swapped 
                    return -1;
                } 
            else
            {
                //not swapped
                return 1;
            }
        }
     };
     // using lamda expression
    //   Comparator <Integer> com2 =(Integer a, Integer b)->
    //   {
    //     if(a%10>b%10)
    //     {
    //         return -1;
    //     }
    //     else{
    //         return 1;
    //     }
    //   };


    // lamda expression bitiwse op

    Comparator com3=(Integer a, Integer b)->a<b?-1:1;
    System.out.println(" lamda expression and bitwise op based on second digit"+list);

    Comparator com4=( a,  b)->Integer.compare(a,b);
    Collections.sort(list,com4);
    System.out.println(" lamda expression and bitwise op based on second digit"+list);





    Collections.sort(list,com);
    System.out.println("Sorted based on second digit "+list);

     Collections.sort(list,desc);
    System.out.println("Sorted based on second digit "+list);
  }  
}
