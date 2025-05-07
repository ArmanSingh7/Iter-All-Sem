import java.util.Scanner;
public class program9method {

	public static void main(String[] args) {
		System.out.println("enter row and column no.");
		Scanner sc =new Scanner(System.in);
		int r=sc.nextInt();
		int c = sc.nextInt();
		double a[][]=new double[r][c];
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				a[i][j]=sc.nextDouble();
            }
			
		}
		double sum= sumMajordiagonal(a);
		System.out.println(sum);
	}
		public static double sumMajordiagonal(double[][] m)
		{
			double sum =0;
			for (int i=0;i<m.length;i++)
			{
				for (int j=0;j<m[0].length;j++)
				{
					if(i==j)
					{
						sum = sum+m[i][j];
					}
				}
			}
			return sum;
			
		
		// TODO Auto-generated method stub

	}

}
