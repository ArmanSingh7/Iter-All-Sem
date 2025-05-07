public class Aq3Swap_ith_jth {
    public static void main(String[] args) {
        int x=1001;
        int i=0;
        int j=2;
        int res=swap(x,i,j);
        System.out.println("number after swapping: "+ Integer.toBinaryString(res));//01100
    }
    public static int swap(int n,int i, int j){
        if (((n>>i)&1)!=((n>>j)&1)) {
            n = n^((1<<i)|(1<<j));
            
        }
        return n;
    }
}
