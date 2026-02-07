package com.seatallocation;

import java.util.List;

public interface SeatDAO {
    boolean assignSeat(Student student);
    boolean cancelSeat(int seatNumber);
    boolean isSeatAvailable(int seatNumber);
    List<Student> getAllSeats();
    void resetSeats();
}