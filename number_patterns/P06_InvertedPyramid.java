package number_patterns;

import java.util.Scanner;

public class P06_InvertedPyramid {

	public static void main(String[] args) {
		
		// object creation
        Scanner	in = new Scanner(System.in);

        // variable declaration
        int n;

        // getting input
        System.out.print("Enter rows: ");
        n = in.nextInt();

        // process
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        // destroy object
        in.close();

	}

}
