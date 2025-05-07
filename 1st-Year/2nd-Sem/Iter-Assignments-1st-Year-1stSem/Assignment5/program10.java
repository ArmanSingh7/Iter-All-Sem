import java.util.Scanner;
public class program10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
    
        int a = 0, b = 1, c = 1;
        int next;
    
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
        for (int i = 3; i < n; i++) {
          next = a + b + c;
          System.out.println(next);
          a = b;
          b = c;
          c = next;
        }
      }
}