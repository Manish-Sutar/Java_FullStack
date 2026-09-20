public class obj1{
    @Override
     public String toString()
        {
            return "bye world";
        }
        public int hashcode()
        {
            return 1;
        }
    public static void main(String args[])
    {
       
        obj1 demo =new obj1();
        System.out.println(demo);
        
        System.out.println(demo.toString());
        System.out.println(demo.hashCode());
        System.out.println(demo.getClass());

    }
    
}
