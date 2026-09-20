import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {

    int id;
    String name;
    int sal;

    Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }

    // Comparable: Sort by salary
    @Override
    public int compareTo(Employee e) {
        return Integer.compare(this.sal, e.sal);
    }
}

public class EmployeeDetails {

    public static void main(String args[]) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "raj", 4500));
        list.add(new Employee(2, "shyam", 1800));
        list.add(new Employee(3, "raj", 4500));

        System.out.println("Original List:");
        for (Employee val : list) {
            System.out.println(val);
        }

        // Comparable - sort by salary
        Collections.sort(list);

        System.out.println("\nSorted by Salary:");
        for (Employee val : list) {
            System.out.println(val);
        }

        // Comparator - sort by ID
        Comparator<Employee> com2 = (a, b) -> Integer.compare(a.id, b.id);

        Collections.sort(list, com2);

        System.out.println("\nSorted by ID:");
        for (Employee val : list) {
            System.out.println(val);
        }


        // sort by name of employee
        Comparator <Employee>com3 =new Comparator<Employee>() {
            public int compare(Employee a, Employee b)
            {
                if(a.name.length()>b.name.length())
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };
        
        // salary 
        Comparator <Employee>com4 =new Comparator<Employee>() {
            public int compare(Employee a, Employee b)
            {
                if(a.sal>b.sal)
                {
                    return -1;
                }
                
                else
                {
                    return 1;
                }
            }
        };

        // priting 
        System.out.println("based on salary sorting");
        Collections.sort(list,com4);

        for (Employee val : list) {
            System.out.println(val);
        }


       // salary comparision through lamda expression

       System.out.println("lamda code based on salary");
       Comparator <Employee> cpm6 =(a,b)->Integer.compare(a.sal,b.sal);
       Collections.sort(list,cpm6);
       System.out.println(list);

    }
}