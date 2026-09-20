import java.util.*;

class Employee {
    int id;
    String name;
    String dep;
    double Salary;

    Employee(int id, String name, String dep, double Salary) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.Salary = Salary;
    }

    void Display() {
        System.out.println("\nEmployee data is :");
        System.out.println("Name is : " + name);
        System.out.println("Your id is : " + id);
        System.out.println("Department is : " + dep);
        System.out.println("Your salary is: " + Salary);
    }
}

public class Employeemng {

    static ArrayList<Employee> employees = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    // Add Employee
    static void addEmployee() {

        System.out.println("\nEnter employee id:");
        int id = sc.nextInt();

        System.out.println("Enter employee name:");
        String name = sc.next();

        System.out.println("Enter employee salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter employee department:");
        String dep = sc.next();

        Employee e = new Employee(id, name, dep, salary);

        employees.add(e);

        System.out.println("Employee added successfully!");
    }

    // Search Employee by ID
    static void searchEmp() {

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).id == id) {

                employees.get(i).Display();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found by ID");
        }
    }

    // Search Employee by Name
    static void searchName() {

        System.out.println("Please enter Employee name:");
        String name = sc.next();

        boolean found = false;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).name.equalsIgnoreCase(name)) {

                employees.get(i).Display();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Data not found by name");
        }
    }

    // Display All Employees
    static void displayEmployee() {

        if (employees.size() == 0) {

            System.out.println("No employee is found");

            return;
        }

        System.out.println("\nAll Employee Data:");

        for (int i = 0; i < employees.size(); i++) {

            employees.get(i).Display();
        }
    }

    // Update Salary
    static void updateSalary() {

        System.out.println("Enter employee ID:");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).id == id) {

                System.out.println("Please enter updated salary:");

                double update = sc.nextDouble();

                employees.get(i).Salary = update;

                found = true;

                System.out.println("Your salary is updated");

                break;
            }
        }

        if (!found) {

            System.out.println(
                "No employee found for this ID for updating salary"
            );
        }
    }

    // Update Department
    static void updateDepartment() {

        System.out.println("Please enter your employee ID:");

        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).id == id) {

                System.out.println(
                    "Please enter updated department name:"
                );

                String dep = sc.next();

                employees.get(i).dep = dep;

                found = true;

                System.out.println("Department updated successfully");

                break;
            }
        }

        if (!found) {

            System.out.println("No employee is found");
        }
    }

    
    static void deleteEmployee() {

        System.out.println("Please enter Employee ID for deleting:");

        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).id == id) {

                employees.remove(i);

                found = true;

                System.out.println("Employee is deleted");

                break;
            }
        }

        if (!found) {

            System.out.println(
                "Employee is not found for deletion"
            );
        }
    }

   
    static void highestPaid() {

        if (employees.size() == 0) {

            System.out.println("No employee available");

            return;
        }

        Employee highest = employees.get(0);

        for (int i = 1; i < employees.size(); i++) {

            if (employees.get(i).Salary > highest.Salary) {

                highest = employees.get(i);
            }
        }

        System.out.println("\nHighest Paid Employee:");

        highest.Display();
    }


    static void lowestPaid() {

        if (employees.size() == 0) {

            System.out.println("No employee available");

            return;
        }

        Employee lowest = employees.get(0);

        for (int i = 1; i < employees.size(); i++) {

            if (employees.get(i).Salary < lowest.Salary) {

                lowest = employees.get(i);
            }
        }

        System.out.println("\nLowest Paid Employee:");

        lowest.Display();
    }

    
    static void displayByDepartment() {

        System.out.println("Enter department name:");

        String department = sc.next();

        boolean found = false;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).dep.equalsIgnoreCase(department)) {

                employees.get(i).Display();

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                "No employee found in this department"
            );
        }
    }

    // Main Method
    public static void main(String[] args) {

        int choice;

        do {

            
            System.out.println("   Employeee mangement system");
            

            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Search Employee by Name");
            System.out.println("5. Update Salary");
            System.out.println("6. Update Department");
            System.out.println("7. Delete Employee");
            System.out.println("8. Find Highest Paid Employee");
            System.out.println("9. Find Lowest Paid Employee");
            System.out.println("10. Display Employees by Department");
            System.out.println("11. Exit");

            System.out.println("\nEnter your choice:");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployee();
                    break;

                case 3:
                    searchEmp();
                    break;

                case 4:
                    searchName();
                    break;

                case 5:
                    updateSalary();
                    break;

                case 6:
                    updateDepartment();
                    break;

                case 7:
                    deleteEmployee();
                    break;

                case 8:
                    highestPaid();
                    break;

                case 9:
                    lowestPaid();
                    break;

                case 10:
                    displayByDepartment();
                    break;

                case 11:
                    System.out.println(
                        "exit"
                    );
                    break;

                default:
                    System.out.println(
                        "wrong choice"
                    );
            }

        } while (choice != 11);

        sc.close();
    }
}