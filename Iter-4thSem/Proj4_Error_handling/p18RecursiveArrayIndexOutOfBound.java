package Proj4_Error_handling;

import java.util.Arrays;

public class p18RecursiveArrayIndexOutOfBound {
	public static void recursive(int arr[],int index) {
		if(index>=arr.length)
			throw new ArrayIndexOutOfBoundsException("index is out of bound");
		try {
			arr[index]*=2;
			recursive(arr,index+1);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return;
		}
	}
 public static void main(String []args) {
	 int arr[] = {1,2,3,4,5};
	 recursive(arr,4);
	 System.out.println(Arrays.toString(arr));
 }
}
