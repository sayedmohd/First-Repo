package org.array;

public class First {
	static int arr[]= {1,2,3,4};
	static int sum() {
		int sum=0;
				for (int j = 0; j < arr.length; j++) {
					sum += arr[j];
				}
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println(sum());
	}
	
	
	
	
	
	
}