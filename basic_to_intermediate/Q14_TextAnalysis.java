package basic_to_intermediate;

import java.util.Scanner;

public class Q14_TextAnalysis {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable Declaration or Memory Reservation
        int letters = 0, digits = 0, spaces = 0, others = 0;

        // Getting Input
        System.out.println("Enter the text below:");
        String text = in.nextLine();

        // Process the Result
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                others++;
            }
        }

        // Print the Output
        System.out.println("Letters : " + letters);
        System.out.println("Digits : " + digits);
        System.out.println("Space Chars : " + spaces);
        System.out.println("Others : " + others);

        // Destroy the scanner object
        in.close();
    }
}
