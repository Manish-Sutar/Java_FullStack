import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Collections;

class EmployeeDetails
{
 
}
 class Employee implements Comparable<Employee>
{
int id;
 String name;
 int sal;
 
 public Employee(int id, String name, int sal) {
    this.id = id;
    this.name = name;
    this.sal = sal;
 }

 @Override
 public String toString() {
    return "EmployeeDetails [id=" + id + ", name=" + name + ", sal=" + sal + "]";
 }
public int  compareTo(Employee that)
{
    if(this.id>that.id)
    {
       return 1;
    }
    else
    {
        return -1;
    }
}
} 
public class ComparabaleInt {
    public static void main(String[] args) {
        List <Employee> emp=new ArrayList<>();
        emp.add(new Employee(3,"rajesh", 5000));
         emp.add(new Employee(4,"ramesh", 50000));
          emp.add(new Employee(5,"raj", 52000));

          Collections.sort(emp);
          for(Object val: emp)
          {
            System.out.println(val);
          }

          // lamda
//          Comparator<Employee> com5=new Comparable() {
//            pubic int CompareTo(Employee that)
//            {
//                if(this.id>that.id){
//
//                }
//            }
//          };

       Collections.sort(emp);
       for(Object ob:emp)
       {
        System.out.println(ob);
       }
    }
}
