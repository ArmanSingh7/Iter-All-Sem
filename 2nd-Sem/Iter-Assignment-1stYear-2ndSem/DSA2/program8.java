import java.util.Scanner;

interface DetailInfo {
    void display();
    int count();
}

class Person1 implements DetailInfo {
    String name;
    static int maxcount = 20;

    public Person1(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public int count() {
        return name.length();
    }
 }
   public class program8{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        Person1 person = new Person1(name);
        person.display();
        int count=person.count();
        System.out.println("No. of characters in the name: " + count);
       // System.out.println("Maximum count: " + person.maxcount);

        
    }
}