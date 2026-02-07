package number_patterns;

import java.util.Scanner;

public class P11_Floyd {

	public static void main(String[] args) {
		
		// object creation
        Scanner in = new Scanner(System.in);

        // variable declaration
        int n, num = 1;

        // getting input
        System.out.print("Enter rows: ");
        n = in.nextInt();

        // process
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(num++ + " ");
            System.out.println();
        }

        // destroy object
        in.close();

	}

}
