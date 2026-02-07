package number_patterns;

import java.util.Scanner;

public class P12_InvertedNumber {

	public static void main(String[] args) {
		
		// object creation
        Scanner in = new Scanner(System.in);

        // variable declaration
        int n;

        // getting input
        System.out.print("Enter rows: ");
        n = in.nextInt();

        // process
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

        // destroy object
        in.close();

	}

}
