public class Aq5XxYmul {
    public static void main(String[] args) {
        long x=5,y=10;
        long res=multiply(x,y);
        System.out.println(res);

    }
    public static long multiply(long x, long y){
        long sum=0;
        while(x!=0){
            if((x&1)!=0)// if the last bit is 1 add y to sum
            sum=add(sum,y);
            x>>=1;
            y<<=1;
        }
        return sum;
    }
    public static long add(long x, long y){
        long carry;
        while (y!=0) {
            carry=x&y;
            //it finds the carry bits 
            x=x^y;
            y=carry<<1;            
        }
        return x;
    }
}
