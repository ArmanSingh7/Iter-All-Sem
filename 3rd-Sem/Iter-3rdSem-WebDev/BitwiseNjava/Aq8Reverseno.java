public class Aq8Reverseno {
    public static void main(String[] args) {
        int x=1234;
        System.out.println(rev(x));

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
