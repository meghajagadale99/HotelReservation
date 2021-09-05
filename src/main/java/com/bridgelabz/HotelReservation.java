package com.bridgelabz;

import java.util.List;
import java.util.ArrayList;

public class HotelReservation {
    private List<Hotel> hotels;

    public HotelReservation() {
        this.hotels = new ArrayList<>();
    }
    public boolean addHotel(Hotel hotel) {
        return this.hotels.add(hotel);
    }
}