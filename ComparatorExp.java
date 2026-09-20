import java.util.*;




public class ComparatorExp
{
public static void main(String args[])
{
    List<String>str=Arrays.asList("rohan","shyam","ram1","raj","raj");
    System.out.println(str);
    Collections.sort(str);
    System.out.println("sorted array"+str);

    Comparator<String> com =new Comparator<>()
     {
        public int compare(String a, String b)
        {
            if(a.length()>b.length())
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

     Comparator<String> com2 =(a,b)->Integer.compare(a.length(), b.length());
     Collections.sort(str,com2);


System.out.println("sorting String based on integer class compare method"+str);

    
}
}