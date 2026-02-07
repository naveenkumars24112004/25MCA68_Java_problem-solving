package number_patterns;

import java.util.Scanner;

public class P20_Butterfly {

	public static void main(String[] args) {
		

        // object creation
        Scanner in = new Scanner(System.in);

        // variable declaration
        int n;

        // getting input
        System.out.print("Enter size: ");
        n = in.nextInt();

        // process (upper wings)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int s = 1; s <= 2 * (n - i); s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        // process (lower wings)
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int s = 1; s <= 2 * (n - i); s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        // destroy object
        in.close();


	}

}
