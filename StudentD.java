import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
class  Student
{
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    // @Override
    // public String toString()
    // {
    //     StringBuilder sb= new StringBuilder();
    //     sb.append("Student{");
    //     sb.append(name)
    // }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
    


    
}

public class StudentD {
    public static void main(String[] args) {
        List list =new ArrayList<>();
        list.add(new Student(1,"raj", 87));
        list.add(new Student(2,"shyam", 80));
        list.add(new Student(3,"raj1", 81));


        // lamda
        Comparator<Student> com=(a,b)->Integer.compare(a.id,b.id);

        Collections.sort(list,com);

        for(Object obj:list)
        {
            System.out.println(obj);
        }
        //String compare method compare first chracter to check

        // Comparator<Student>com1=( a, b)->a.name.compareTo(b.name);

        Comparator <Student> com2=(a,b)->Integer.compare(a.name.length(), b.name.length());

        Collections.sort(list,com2);

        System.out.println(" sort by name");

        for(Object val:list)
        {
            System.out.println(val);
        }

    //   List<Integer> list2=Arrays.asList(45,32,43,21,12,65);

    System.out.println("number");
    List <Integer>listval =Arrays.asList(25,53,23,44);
   Comparator com5 =(a,b)->a>b?1:-1;
   Collections.sort(listval,com5);

      
    Collections.sort(listval);
    

       
    }
    
}
