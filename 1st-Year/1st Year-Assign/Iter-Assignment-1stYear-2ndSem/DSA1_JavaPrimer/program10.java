import java.util.Scanner;
public class program10 {

	public static void main(String[] args) 
	{
		System.out.println("enter no. of row and column");
		Scanner sc =new Scanner(System.in);
		int r= sc.nextInt();
		int c = sc.nextInt();
		System.out.println("enter column index");
		int ci=sc.nextInt();
		double a[][]=new double[r][c];
		for (int i =0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				a[i][j]=sc.nextDouble();
			}
		}
	
		double sumcol= sumColumn(a);
		System.out.println(sumcol);
//		for (int i=0;i<c;i++)
//		{
//			System.out.println("sum of elements at col"+i+"="+sumcol);
//		}
 }
	public static double sumColumn(double[][]m)
	{
		//int ci1=ci;
	    double sum=0;
		for (int i=0;i<m[0].length;i++)
		{
			for (int j=0;j<m.length;j++)
			{
				sum=m[j][i]+sum;
			}
			System.out.println(sum);
			sum=0;
		}
		return sum;
	}

}
