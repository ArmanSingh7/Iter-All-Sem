//wap to set the desired bit to 1(change the bit to 1)
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x= sc.nextInt();
        System.out.println("enter the posn");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        
        int newnumber=bitmask | x;
        System.out.println(newnumber);
        sc.close();
        
    }
}
