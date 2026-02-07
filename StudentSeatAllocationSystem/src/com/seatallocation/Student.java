package com.seatallocation;

public class Student {

	private String name;
	private int seatNumber;

	public Student(String name, int seatNumber) {
		this.name = name;
		this.seatNumber = seatNumber;
	}

	public String getName() {
		return name;
	}

	public int getSeatNumber() {
		return seatNumber;
	}
}
