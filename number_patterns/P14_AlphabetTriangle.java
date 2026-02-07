package number_patterns;

import java.util.Scanner;

public class P14_AlphabetTriangle {

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
            char ch = 'A';
            for (int j = 1; j <= i; j++)
                System.out.print(ch++ + " ");
            System.out.println();
        }

        // destroy object
        in.close();

	}

}
