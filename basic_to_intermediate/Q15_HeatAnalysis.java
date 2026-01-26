package basic_to_intermediate;

import java.util.Scanner;

public class Q15_HeatAnalysis {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable Declaration
        int flag;
        String status;

        // Getting Input
        System.out.print("Enter Heat code (1-3): ");
        flag = in.nextInt();

        // Process using switch
        switch (flag) {
            case 1:
                status = "HOT";
                break;
            case 2:
                status = "LUKE WARM";
                break;
            case 3:
                status = "COLD";
                break;
            default:
                status = "OUT OF RANGE";
        }

        // Print the Output
        System.out.println("Flag " + flag + " is " + status);

        // Destroy the scanner object
        in.close();
    }
}
