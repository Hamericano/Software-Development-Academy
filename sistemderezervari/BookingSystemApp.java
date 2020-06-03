package com.sda.sistemderezervari;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingSystemApp {
    private List<Restaurant> restaurants = new ArrayList<>();
    private List<Booking> bookingsList = new ArrayList<>();

    public void addRestaurant() {
        Scanner input = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        System.out.println("Ce nume are restaurantul? ");
        restaurant.setName(input.nextLine());
        System.out.println("Ce descriere are restaurantul? ");
        restaurant.setDescription(input.nextLine());
        System.out.println("Cate mese aveti? ");
        int noTables = input.nextInt();
        for (int i = 0; i < noTables; i++) {
            Table table = new Table();
            System.out.println("Masa " + (i + 1) + " cate scaune are?");
            table.setNumberOfChairs(input.nextInt());
            restaurant.getTables().add(table);
        }
        restaurants.add(restaurant);
    }

    public void book(int indexOfRestaurant) {
        Scanner input = new Scanner(System.in);

        System.out.println("La ce ora doresti sa rezervi ?");
        LocalDateTime startDate = LocalDateTime.parse(input.nextLine());

        System.out.println("Cate ore ?");
        LocalDateTime endDate = startDate.plusHours(input.nextInt());

        System.out.println("Cate persoane ?");
        int numberOfPerson = input.nextInt();

        indexOfRestaurant = indexOfRestaurant - 1;
        Restaurant restaurant = restaurants.get(indexOfRestaurant);

        for (Table table : restaurant.getTables()) {
            if (table.getBookings().size() == 0 && table.getNumberOfChairs() >= numberOfPerson) {
                Booking booking = new Booking();
                booking.setNumberOfPerson(numberOfPerson);
                booking.setStartDate(startDate);
                booking.setEndDate(endDate);
                table.addBooking(booking);
                bookingsList.add(booking);
                System.out.println("Rezervarea ta a fost facuta la masa numarul " + (restaurant.getNumarMasa(table) + 1));
                break;
            }

            if (table.getBookings().size() > 0 && table.getNumberOfChairs() >= numberOfPerson) {
                for (Booking booking : table.getBookings()) {
                    if ((booking.getStartDate().isBefore(startDate) && booking.getEndDate().isBefore(startDate))
                            || booking.getStartDate().isAfter(endDate)) {
                        Booking newBooking = new Booking();
                        newBooking.setStartDate(startDate);
                        newBooking.setEndDate(endDate);
                        newBooking.setNumberOfPerson(numberOfPerson);
                        table.addBooking(newBooking);
                        bookingsList.add(newBooking);
                        System.out.println("Rezervarea ta a fost facuta la masa numarul " + (restaurant.getNumarMasa(table) + 1));
                        break;
                    } else if ((booking.getStartDate().isBefore(startDate) && booking.getEndDate().isBefore(endDate)) ||
                            (booking.getStartDate().isBefore(endDate) && booking.getEndDate().isAfter(endDate)) ||
                            (booking.getStartDate().isAfter(startDate) && booking.getEndDate().isBefore(endDate)) ||
                            (booking.getStartDate().isAfter(startDate) && booking.getEndDate().isAfter(endDate))) {
                        System.out.println("Masa este ocupata");
                        break;
                    }
                }
            }
        }
    }


    public void listAllRestaurants() {
        for (int i = 0; i < restaurants.size(); i++) {
            Restaurant restaurant = restaurants.get(i);
            System.out.println((i + 1) + "." + restaurant.getName());
        }
    }

    public void listAllBookingsBetween(int numberOfRestaurant) {
        Scanner input = new Scanner(System.in);
        System.out.println("De la ce data doresti sa afisezi rezervarile ?"); // 2020-05-05T00:00:00
        LocalDateTime startDate = LocalDateTime.parse(input.nextLine());
        System.out.println("Pana cand doresti sa afisezi rezervarile ?");// 2020-05-06T11:55:55
        LocalDateTime endDate = LocalDateTime.parse(input.nextLine());
        numberOfRestaurant = numberOfRestaurant - 1;
        Restaurant restaurant = restaurants.get(numberOfRestaurant);
        int countBookings = 0;
        for (Table table : restaurant.getTables()) {
            for (Booking booking : table.getBookings()) {
                if (booking.getStartDate().isAfter(startDate) && booking.getEndDate().isBefore(endDate)) {
                    bookingsList.add(booking);
                    countBookings = countBookings + 1;
                } else
                    System.out.println("Nu exista rezervari.");
            }
        }
        System.out.println("Intre " + startDate + " si " + endDate + " avem " + countBookings + " rezervari.");
        for (Booking booking : bookingsList) {
            System.out.println("-> " + booking.getStartDate() + " : "
                    + booking.getNumberOfPerson());
        }
    }
}
