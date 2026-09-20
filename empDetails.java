public class empDetails {
     String name ;
     int id;
     double salary ;
     String dep ;



     empDetails(String name, int id ,double Salary ,String dep)
     {
        this.dep=dep;
        this.id=id;
        this.name=name;
        this.salary=Salary;
     }
    
     public String toString()
     {
        return "name="+name+"\n"+id;

     }
     public static void main(String args[])
     {
        empDetails emp = new empDetails("manish",62,75000,"IT");
        System.out.println(emp);
     }
}
