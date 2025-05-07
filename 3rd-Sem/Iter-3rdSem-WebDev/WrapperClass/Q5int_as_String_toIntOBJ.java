//wap to read integer as string and convert into object data
public class Q5int_as_String_toIntOBJ {
    public static void main(String[] args) {
        String a = "42";
        Integer b=Integer.valueOf(a);
        //Integer c = a; autoboxing doesn't work here
        
        //Integer c = new Integer(a); //alt method(constructor method)
        System.out.println(b);
        //System.out.println(c);
    }
}
