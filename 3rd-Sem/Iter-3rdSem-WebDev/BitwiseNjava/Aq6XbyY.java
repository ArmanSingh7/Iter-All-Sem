public class Aq6XbyY {
    public static void main(String[] args) {
        System.out.println(divide(8,2));//output 4
    }
    public static long divide(long x, long y){
        long quotient=0,k,y2k;
        k=5;//largest k
        y2k=(y<<k);// y*2^k
        while (x>=y) {
            while (y2k>x) {//find the desired k
                y2k=y2k>>1;
                k=k-1;
                
            }
            quotient=quotient+(1<<k);//2^k
                x=x-y2k;
            }
        return quotient;
    }
}
