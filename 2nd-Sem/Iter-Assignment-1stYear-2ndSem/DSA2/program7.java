
import java.util.Scanner;

class person{
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends person {
    int eid;
    double salary;

    public Employee(String name, int age, int eid, double salary) {
        super(name, age);
        this.eid = eid;
        this.salary = salary;
    }

    public void empDisplay() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee age: " + age);
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee salary: " + salary);
    }
}

public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter employee ID: ");
        int eid = scanner.nextInt();
        
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        
        Employee emp = new Employee(name, age, eid, salary);
        emp.empDisplay();
        
        scanner.close();
    }
}