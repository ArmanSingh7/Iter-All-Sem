
//check whether the input position of the bit is 0 or 1
import java.util.Scanner;
public class q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();
        System.out.println("enter the posn to check bit");
        int pos= sc.nextInt();
        int bitmask=1<<pos;
        if ((bitmask&x)==0) {
            System.out.println("posn bit is 0");
        }
        else
        System.out.println("posn bit is 1");
        sc.close();
        
    }
}
