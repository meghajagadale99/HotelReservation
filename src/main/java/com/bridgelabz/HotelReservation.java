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
    public int findCheapestHotel() {
        int LakeWoodRate = 110;
        int BridgeWoodRate = 160;
        int Ridgewood = 220;
        int cheapestHotel = (LakeWoodRate > BridgeWoodRate) ?
                (LakeWoodRate > Ridgewood ? LakeWoodRate : Ridgewood) :
                (BridgeWoodRate > Ridgewood ? BridgeWoodRate : Ridgewood);
        System.out.println("The cheapest Hotel is " + cheapestHotel);
        return cheapestHotel;
    }
}