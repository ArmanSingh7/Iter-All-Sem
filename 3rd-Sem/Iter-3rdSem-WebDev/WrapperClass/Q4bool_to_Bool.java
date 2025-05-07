public class Q4bool_to_Bool {

    public static void main(String[] args) {
        boolean b=true;
        Boolean a=b;//autoboxing
        //value of method to conv prim into obj
        Boolean c=Boolean.valueOf(a);
        System.out.println(c);
        System.out.println(b);
//direct int or double into Integer/Double object
        double d=2.234;
        Double e=d;//autoboxing
        Double f=Double.valueOf(d);
        System.out.println(d+" "+e+" "+f);
    }
}