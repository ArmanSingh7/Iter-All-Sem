public class commandprogram3
{ 
   public static void main(String []args)
   {
      int a = Integer.parseInt(args[0]);
      int b = (int)(Math.random()*(a));
      int c = (int)(Math.random()*(a));
      System.out.println(b + " " + c);
      System.out.println(c+b);
   }
}
