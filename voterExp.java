import java.util.*;
class voter extends Exception
{
    String msg;
    public voter(String msg)
    {
        this.msg=msg;
    }

    public String getMsg()
    {
        return msg;
    }
        
    }
   

class Voterid extends Exception
{
    void apply(int age) throws voter
    {
        if(age==21)
        {
            System.out.println("apply of voter id");
        }
         throw new voter("not eligible for voter id");
        
          
        
    }
}


public class voterExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your age");
        int age =sc.nextInt();

       Voterid obj =new Voterid();

       try
       {
        obj.apply(age);
       }
       catch(voter e)
       {
        System.out.println(e.getMessage());
       }

    }
    
}
