package basic_to_intermediate;

import java.util.Scanner;

public class Q16_ColorAnalysis {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable Declaration
        char colour;
        String colorName;

        // Getting Input
        System.out.print("Enter Color code character: ");
        colour = in.next().charAt(0);  // read single character

        // Process using switch
        switch (colour) {
            case 'r':
            case 'R':
                colorName = "RED";
                break;
            case 'g':
            case 'G':
                colorName = "GREEN";
                break;
            case 'b':
            case 'B':
                colorName = "BLUE";
                break;
            default:
                colorName = "BLACK";
        }

        // Print the Output
        System.out.println("Color Code " + colour + " is " + colorName);

        // Destroy the scanner object
        in.close();
    }
}
