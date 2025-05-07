public class Aq7PowerX_Y {
    public static void main(String[] args) {
        double x=2;//010
        int y=3;//011
        System.out.println(Power(x,y));//8
    }
    static double Power(double x, int y){
        double res=1.0;
        if (y<0) {
            y=-y;
            x=1.0/x;
        }
        while (y!=0) {
            if ((y & 1)!=0) {//
                res=res*x;
            }
            x=x*x;//
            y=y>>1;
            
        }
        return res;
    }
}
