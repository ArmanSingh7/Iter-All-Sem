package Demoo;
import java.util.*;
public class dem{

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList al1 = new ArrayList();
        
        al.add(1);
        al.add(20);
        al.add(3);
        
        Collections.sort(al);
        System.out.println(al);
//        
//        Iterator it = al iterator();
//        while (it.hasNext()){
//        	System.out.println(it.next());
//        }
        
     
        HashMap a = new HashMap();
        a.put(102, "A");
        a.put(101, "L");
        a.put(103, "P");
        System.out.println(a);
        
        
        TreeMap a1 = new TreeMap();
        a1.put(106, "A");
        a1.put(102, "B");
        a1.put(103, "C");
        a1.put(108, "D");
        a1.put(109, "F");
        a1.put(103, "P");
        
        System.out.println(a1.ceilingEntry(104));
        System.out.println(a1.floorKey(101));
        
        
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(3);
        pq.add(1);
        pq.add(2);
        //pq.add(5);
        pq.add(2);
        pq.add(4);
        System.out.println(pq.peek());
        
        ArrayList  al3  = new ArrayList<>();
        al3.add("Name1");
        al3.add("name2");
        al3.add(10);
        
        String s1= (String)al3.get(0);
        System.out.println(s1);
        //String s2 = (String)al3.get(2);
       // System.out.println(s2);
        
        
        String r1 = "1";
        String r2= "poc";
//        System.out.println(r1.equals(r2));
//        System.out.println(r1.compareTo(r2));
        r1.concat(r2);
        System.out.println(r1);
        System.out.println();
        
        String str="Programming:language:java";
//        System.out.println(String.join("psadkv",r1,r2));
       String [] str1= str.split("m",0);
        
        for(String a5 :str1) {
        	System.out.println(a5);
        }
        String so= "Javaa";
        String so1[]=so.split("a",-2);
        for(String a6 :so1) {
        	System.out.println(a6);
        }
        
        
    }


}
