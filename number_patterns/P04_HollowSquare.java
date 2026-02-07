package number_patterns;

import java.util.Scanner;

public class P04_HollowSquare {

	public static void main(String[] args) {
		
		// object creation
        Scanner in = new Scanner(System.in);

        // variable declaration
        int n;

        // getting input
        System.out.print("Enter size: ");
        n = in.nextInt();

        // process
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // destroy object
        in.close();

	}

}
