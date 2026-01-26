package basic_to_intermediate;

import java.util.Scanner;

public class Q17_IceWaterSteam {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable declaration
        double temp;
        String status;

        // Getting input
        System.out.print("Enter the water temperature: ");
        temp = in.nextDouble();

        // Process with if-else
        if (temp < 0) {
            status = "ICE";
        } else if (temp <= 100) {
            status = "WATER";
        } else {
            status = "STEAM";
        }

        // Print the output
        System.out.printf("Water status is %s for the Temperature %.2f%n", status, temp);

        // Destroy the scanner object
        in.close();
    }
}
