/*Question-8:
WAP to enter the value of n and display find the following sum of the series: 
 1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n) */

import java.util.Scanner;
public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)//3
{
          for (int j = 1; j <= i; j++) //1
          {
            sum += j;//1  1+2 1+2+3
          }
        }
        System.out.println("The sum of the series is: " + sum);
      }
}