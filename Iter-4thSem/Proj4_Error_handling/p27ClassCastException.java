package Proj4_Error_handling;

public class p27ClassCastException {
	public static void main(String[] args)
    {
        try 
        {
            Object obj = new Object();
            String str = (String)obj;
            System.out.println("Successfully casted: " + str);
        }
        catch (ClassCastException e)
        {
            System.out.println(e);
        }
    }
}