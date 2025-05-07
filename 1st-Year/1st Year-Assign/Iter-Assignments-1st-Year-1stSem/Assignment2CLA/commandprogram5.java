public class commandprogram5
{
  public static void main(String []args)
  {
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     int c = Integer.parseInt(args[2]);
     int max = (int)(Math.max(a,b));
     max = (int)(Math.max(max,c));
     int min = (int)(Math.min(a,b));
     min = (int)(Math.min(min,c));
     int mid = (a +b + c)-(max+min);
     System.out.println(a+" "+b+" "+c);
     System.out.println("max = " + max + " min =" + min);
     System.out.println("ascending order- " +min +" "+ mid + " " + max);

     
  }
}
