// Create an Character object then convert it into java
public class Q12CrObjthnPrim {
    public static void main(String[] args) {
        //creating obj
        Character a =Character.valueOf('a');
        //converting into prim
        char v=a;//auto unboxing
        char val=a.charValue();//other method to convert
        System.out.println(v);
        System.out.println(val);
//converting integer obj into int data type
        Integer x= Integer.valueOf("23");
        int y=Integer.parseInt("23");//value of string method
        int z = x;//auto unboxing
        System.out.println(x+" "+y+" "+z);
    }
}
