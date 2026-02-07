package com.seatallocation;


import java.util.List;

public class SeatService {

    private SeatDAOImpl dao = new SeatDAOImpl();

    public void assignSeat(String name, int seat) {
        if (dao.assignSeat(new Student(name, seat)))
            System.out.println("Seat assigned successfully.");
        else
            System.out.println("Seat already allocated.");
    }

    public void checkSeat(int seat) {
        if (dao.isSeatAvailable(seat))
            System.out.println("Seat is available.");
        else
            System.out.println("Seat already occupied.");
    }

    public void cancelSeat(int seat) {
        if (dao.cancelSeat(seat))
            System.out.println("Seat cancelled.");
        else
            System.out.println("Seat not found.");
    }

    public void viewAll() {
        List<Student> list = dao.getAllSeats();
        if (list.isEmpty()) {
            System.out.println("No seat allocations found.");
            return;
        }
        for (Student s : list) {
            System.out.println("Student Name: " + s.getName()
                    + " | Seat Number: " + s.getSeatNumber());
        }
    }

    public void reset() {
        dao.resetSeats();
        System.out.println("All seats reset.");
    }
}