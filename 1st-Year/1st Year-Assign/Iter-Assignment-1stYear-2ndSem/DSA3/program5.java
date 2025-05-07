import java.util.Scanner;
public class program5 {
	public static <T> int count(T[] array, T item) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==item)
				count=count+1;
			}
			return count;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array elements");
		Integer arr[]=new Integer[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element to search ");
		int a = sc.nextInt();
		System.out.print("The occurence of "+a+" is "+count(arr,a));
		
		// TODO Auto-generated method stub

	}

}
