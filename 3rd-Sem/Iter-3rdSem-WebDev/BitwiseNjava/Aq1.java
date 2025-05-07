//computing the number of bits set to 1 
//count the number of bits that are set to 1
public class Aq1 {
    public static void main(String[] args) {
        int x=01101;//input
        int y=6;//0110
        System.out.println(count_bit(y));//2
        System.out.println(count_bit(x));//3
        
        
    }
    public static int count_bit(int n){
        int count=0;
        while (n!=0) {
            count=count+(n&1);//extracting the last bit and adding with count
            n=n>>>1;//right shifts the number by 1 to find the next right most bit of the input
        }
        return count;
    }
}
