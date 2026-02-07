package com.seatallocation;

import java.util.Scanner;

public class SeatAllocationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SeatService service = new SeatService();

        System.out.println("Student Seat Allocation System");

        while (true) {

        	System.out.println("\nEnter your choice:");
            System.out.println("1. Enter student name and assign seat number");
            System.out.println("2. Check seat availability");
            System.out.println("3. Prevent duplicate seat (automatic)");
            System.out.println("4. Cancel seat");
            System.out.println("5. View all allocations");
            System.out.println("6. Reset seating");
            System.out.println("7. Exit");

            System.out.print("\nChoice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {

                case 1:
                    System.out.print("\nEnter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Assign seat number: ");
                    int seat = sc.nextInt();

                    service.assignSeat(name, seat);
                    break;

                case 2:
                    System.out.print("\nCheck seat availability - Enter seat number: ");
                    service.checkSeat(sc.nextInt());
                    break;

                case 3:
                    System.out.println("\nDuplicate seat prevention is handled automatically.");
                    System.out.println("Try assigning an already allocated seat to see this feature.");
                    break;

                case 4:
                    System.out.print("\nCancel seat - Enter seat number: ");
                    service.cancelSeat(sc.nextInt());
                    break;

                case 5:
                    System.out.println("\nView all allocations:");
                    service.viewAll();
                    break;

                case 6:
                    System.out.println("\nReset seating:");
                    service.reset();
                    break;

                case 7:
                    System.out.println("\nExiting system.");
                    sc.close();
                    return;

                default:
                    System.out.println("\nInvalid choice.");
            }
        }
    }
}
