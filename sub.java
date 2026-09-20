  class employee
 {
    private int id,salary;
    private String name;
    employee(int id, int salary ,String name)
    {
      this.id=id;
      this.salary=salary;
      this.name=name;
 } 
 int get()
 { 
    return id;
 }
 int set()
 {
    return id;
 }
 int getname()
 { 
    return name;
 }
 int setname()
 {
    return name;
 }
 
 int getsalary()
 { 
    return salary;
 }
 int setsalary(int salary)
 {
    this.salary=salary;
 }
public int calculatesalary()
{
    return salary;

}
public developer extends employee
{
    developer(int id,String name,int salary)
    {
        super(id,name,salary);
    }
    int calculatesalary(int salary)
    {
return getsalary()+1000;
    }
}



public class sub {
    
}
