import java.util.Scanner;
public class program4 {
public static <E> void printArray(E[] inputArray) {
	for(int i=0;i<inputArray.length;i++) {
		System.out.println(inputArray[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements: ");
		Integer [] arr1 = new Integer[5];
		for(int i=0;i<5;i++)
			arr1[i]=sc.nextInt();
		System.out.println("printing 1st array ");
		printArray(arr1);
		System.out.println("enter elements for 2nd");
		String[] arr2=new String [3];
		for(int i=0;i<3;i++)
			arr2[i]=sc.next();
		System.out.println("printing 2nd array");
		printArray(arr2);
			
			
		// TODO Auto-generated method stub

	}

}
