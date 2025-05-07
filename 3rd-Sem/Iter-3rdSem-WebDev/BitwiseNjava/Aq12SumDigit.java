import java.util.Scanner;

public class Aq12SumDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer number: ");
        int num2 = scanner.nextInt();

        int newNumber = Integer.parseInt(String.valueOf(num1).substring(0, 2) +
         String.valueOf(num2).substring(String.valueOf(num2).length() - 2));

        System.out.println("New number: " + newNumber);
    }
}