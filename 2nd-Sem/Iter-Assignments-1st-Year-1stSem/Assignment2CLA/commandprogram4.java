public class commandprogram4
{
   public static void main(String []args)
   {
     Double t = Double.parseDouble(args[0]);
     System.out.println((double)Math.cos(5*t)+(double)Math.sin(7*t));
   }
}
