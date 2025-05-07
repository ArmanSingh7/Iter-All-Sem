import java.util.Scanner;
public class program9 {
    static int fib(int n){
        //base case
        if(n==0 || n==1)
            return n;
        int fibo = fib(n-1)+fib(n-2);

        return fibo;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter n");
    	int n = sc.nextInt();
        for (int i=0;i<=n;i++) {
            System.out.print(fib(i)+" ");
        }
    }
}
