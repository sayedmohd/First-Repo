package org.array;

public class Array {
	public static void main(String[] args) {

		char a[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println("Array total length : " + a.length);

		System.out.println("=========================");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int id[] = { 11,22,33,44,55,66,77,11,22};
		System.out.println("Array total length : " + id.length);

		System.out.println("=========================");

		for (int j = 0; j < id.length; j++) {
			System.out.println(id[j]);
		}
		
		String name[] = {"C", "C++", "COBAL", "JAVA", "PYTHON", "PERL", "CODE", "Program"};
		System.out.println("Array total length : " + name.length);

		System.out.println("=========================");

		for (int k = 0; k < name.length; k++) {
			System.out.println(name[k]);
		}
		
		int a1[] = new int[5];
		
		a1[0] = 111;
		a1[2] = 222;
		a1[1] = 333;
		a1[4] = 444;
		
		System.out.println("Array total length : " + a1.length);

		System.out.println("=========================");

		for (int l = 0; l < a1.length; l++) {
			System.out.println(a1[l]);
		}

	}
}
