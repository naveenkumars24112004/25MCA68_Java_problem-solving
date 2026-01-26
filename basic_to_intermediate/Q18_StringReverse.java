package basic_to_intermediate;

import java.util.Scanner;

public class Q18_StringReverse {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable declaration
        String text, reverseText = "";

        // Getting input
        System.out.println("Enter the string below:");
        text = in.nextLine();

        // Process: reverse using loop
        for (int i = text.length() - 1, j = 0; i >= 0; i--, j++) {
            reverseText = reverseText + text.charAt(i);
        }

        // Print the output
        System.out.println("Reversed Text: " + reverseText);

        // Destroy the scanner object
        in.close();
    }
}
