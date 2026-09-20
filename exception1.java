class ZeroException extends Exception{
    String msg;
    public ZeroException(String msg)
    {
        this.msg=msg;
    }
    public String getMsg()
    {
        return msg;
    }
}


public class exception1 {
    
    public static void main(String main[])
    {
        int i=20;
        int j=0;

        try
        {
             int result =i/20;
             j=i/20;
             if(j==0)
             {
                throw new ZeroException("not accept zero value");
                          }
             System.out.println(result);
        }
        catch(Exception e)
        {

        System.out.println("handle");
        System.out.println(e.getMessage());
        }
        System.out.println(j);
    }
}
