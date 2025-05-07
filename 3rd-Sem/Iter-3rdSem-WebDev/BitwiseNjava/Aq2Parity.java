//the parity of a binary word is 1 if the no. of 1 is odd else 0. Wap to count the parity of an integer number using
//bitwise operator
public class Aq2Parity {
    public static void main(String[] args) {
        int x=100101;
        System.out.println(Parity(x));
    }
    public static int Parity(int n){
        int count=0;
        //parity check using xor
        // 0xor last bit
        while (n!=0) {
            count=count^(n&1);//each bit is checked if it is first 1 then count will become 1, if it is second then it will become 0,
            //basically if the input contains odd numbers of 1 then count will become 1 else 0
            n=n>>>1;
        }
        return count;
    }
}
