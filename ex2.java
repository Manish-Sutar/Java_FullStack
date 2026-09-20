// interface test
// {
//     void salary();
// }

// class employee implements test
// {
//     public void salary()
//     {
//         System.out.println("salary of employee ");
//     }
// }
// class manager implements test
// {
//     public void salary()
//     {
//         System.out.println("salary of manager");
//     }
//}

interface emp
{
    void sql();
}
class dev implements emp{
    public void sql()
    {
        System.out.println("3000 for developer");
    }
}




public class ex2 {
    public static void main(String args[])
    {
        // employee e1 = new employee();
        // e1.salary();
        // manager m1 = new manager();
        // m1.salary();

        dev obj = new dev();
        obj.sql();
    }
}
