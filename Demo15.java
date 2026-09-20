import java.sql.*;
import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) throws Exception{
        String url="jdbc:postgresql://localhost:5432/jdbcExampe";
        String user="postgres";
        String password="tiger";
        Connection con= DriverManager.getConnection(url,user,password);
        Statement st= con.createStatement();
        // accessing value
        ResultSet res= st.executeQuery("select name from employee where id=3");
        res.next();
        System.out.println(res.getString("name"));

         inserting value
        Boolean check2=st.execute("insert into employee values(5,'Om',60000,32)");
        System.out.println(check2);

       //  user input for inserting data in table
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id = ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name = ");
        String name=sc.nextLine();
        System.out.println("Enter your salary = ");
        int sal=sc.nextInt();
        System.out.println("Enter your age = ");
        int age=sc.nextInt();

//        PreparedStatement pr = con.prepareStatement("insert into employee values(?,?,?,?)");
//        pr.setInt(0,id);
//        pr.setString(1,name);
//        pr.setInt(2,sal);






//        st.execute("insert into employee values ("+id+",'"+name+"',"+sal+","+age+")");

//        ResultSet set = st.executeQuery("select * from employee");
//        System.out.println("Details of the employees ");
//        while(set.next()){
//            System.out.print(set.getInt("id")+ " "+set.getString("name")+
//                    " "+set.getInt("age")+" "+set.getInt("salary"));
//            System.out.println();
//        }






    }
}