package com.sda.sistemderezervari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Table{

    Scanner input = new Scanner(System.in);

    private List<Booking> bookings = new ArrayList<>();

    private int numberOfChairs;

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public void addBooking(Booking booking){
        bookings.add(booking);
    }

}
