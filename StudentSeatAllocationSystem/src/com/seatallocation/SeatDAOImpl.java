package com.seatallocation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeatDAOImpl implements SeatDAO {

    // Acts like a database table
    private List<Student> seatTable = new ArrayList<>();

    @Override
    public boolean assignSeat(Student student) {
        if (!isSeatAvailable(student.getSeatNumber())) {
            return false;
        }
        seatTable.add(student);
        return true;
    }

    @Override
    public boolean cancelSeat(int seatNumber) {
        Iterator<Student> it = seatTable.iterator();
        while (it.hasNext()) {
            if (it.next().getSeatNumber() == seatNumber) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isSeatAvailable(int seatNumber) {
        for (Student s : seatTable) {
            if (s.getSeatNumber() == seatNumber) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<Student> getAllSeats() {
        return seatTable;
    }

    @Override
    public void resetSeats() {
        seatTable.clear();
    }
}
