package basic_to_intermediate;

import java.util.Scanner;

public class Q01_AreaOfCircle {

	public static void main(String[] args) {
		// Object creation 
				Scanner in = new Scanner(System.in);
				
		// Variable Declaration or Memory Reservation
				float r;
				float area;
				
		// Getting Input
				System.out.println("Enter Radius of Circle: ");
				r = in.nextFloat();
				
		// Process the Result
				//area =(float) (Math.PI * Math.pow(r, 2));
					area = (float) ((22.0/7) * r * r);
				//area = (float) (Math.PI * r * r);
		// Print the Output
				System.out.printf("Area of Circle with Radius %.4f is %.4f", r, area);
			
		// Destroy the scanner object
			in.close();
				
			}

		}


	


