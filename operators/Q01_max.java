package operators;

import java.util.Scanner;

public class Q01_max {

	public static void main(String[] args) {
		
		// object creation
		   Scanner in = new Scanner(System.in);
		   
		// variable declaration or memory reservation
		   int a, b, c, d, max1, max2, max3;
		   
		// getting input
		   System.out.println("Enter the four numbers: ");
		   a = in.nextInt();
		   b = in.nextInt();
		   c = in.nextInt();
		   d = in.nextInt();
		   
		// process the result
		   max1= (a > b) ? a : b;
		   max2= (c > max1) ? c : max1;
		   max3= (d > max2) ? d : max2;
		   
		// print the output
		   System.out.println("the maximum number is : " + max3);
		   
		// destroy the object
		   in.close();

	}

}
