public class Aq4Reverse {
    public static void main(String[] args) {
        int x=5;
        int reversed=revbits(x);
        System.out.println(x);
        System.out.println(reversed);

    }
    public static int revbits(int n){
        int res=0;
        for(int i=0;i<4;i++) {
            res=res<<1;
            res=res|(n&1);
            n=n>>>1;
            
        }
        return res;
    }
}
