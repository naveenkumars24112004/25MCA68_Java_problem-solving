package basic_to_intermediate;

import java.util.Scanner;

public class Q05_AreaVolumeSphere {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable Declaration or Memory Reservation
        double radius, volume, area;

        // Getting Input
        System.out.print("Enter Radius of Sphere: ");
        radius = in.nextDouble();

        // Process the Result
        area = 4 * Math.PI * Math.pow(radius, 2);
        volume = (4/3) * Math.PI * Math.pow(radius, 3);

        // Print the Output
        System.out.printf("Volume of Sphere: %.6f%n", volume);
        System.out.printf("Area of Sphere  : %.6f", area);

        // Destroy the scanner object
        in.close();
    }
}
