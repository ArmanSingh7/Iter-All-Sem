package Proj4_Error_handling;
import java.util.*;

class DynamicArray{
    private LinkedList<Integer> list;
    public DynamicArray() {
        list = new LinkedList<>();
    }
    
    public void add(int ele) {
        list.add(ele);
    }
    
    public int get(int index) {
        try {
            return list.get(index);
        }
        catch(IndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
    }
}

public class p17ArrayindexOutofBound {
    public static void main(String []args) {
        try {
            DynamicArray d =  new DynamicArray();
            for (int i=0;i<10;i++) {
                d.add(i);
            }
            System.out.println(d.get(11));
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
