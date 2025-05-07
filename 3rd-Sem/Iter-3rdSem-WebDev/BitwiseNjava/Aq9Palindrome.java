public class Aq9Palindrome {
    public static void main(String[] args) {
        int x=101;
        System.out.println(rev(x));
        if (x==rev(x)) {
            System.out.println("yes palindrome");  
        }
        else
        System.out.println("no");

    }
    static int rev(int x){
        int r=0;
        while(x!=0){
            r=r*10;
            r=r+(x%10);
            x=x/10;

        }
        return r;
    }
}

