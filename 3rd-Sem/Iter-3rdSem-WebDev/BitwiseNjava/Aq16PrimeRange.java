public class Aq16PrimeRange {
    public static void main(String[] args) {
        int start=3;
        int end=19;
        System.out.println("printing prime from range: ");
        for(int i=start;i<=end;i++){
            if (isprime(i)) {
                System.out.print(i+" ");
                
            }
        }

    }
    public static boolean isprime(int x){
        if (x<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if (x%i==0) {
                return false;   
            }
        }
        return true;
    }
}
