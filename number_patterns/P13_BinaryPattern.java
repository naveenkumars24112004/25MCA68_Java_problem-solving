package number_patterns;

import java.util.Scanner;

public class P13_BinaryPattern {

	public static void main(String[] args) {
		
		// object creation
        Scanner in = new Scanner(System.in);

        // variable declaration
        int n;

        // getting input
        System.out.print("Enter rows: ");
        n = in.nextInt();

        // process
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        // destroy object
        in.close();

	}

}
