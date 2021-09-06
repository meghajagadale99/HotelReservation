package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void whenAddedHotel_ShouldReturn_AddedHotel() {
        Assert.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", "Regular", 110, 90)));
        Assert.assertTrue(hotelReservation.addHotel(new Hotel("Bridgewood", "Regular",150, 50 )));
        Assert.assertTrue(hotelReservation.addHotel(new Hotel("Ridgewood", "Regular", 220, 150)));
    }

    @Test
    public void toFindTheCheapestHotel() {
        HotelReservation cheapHotel = new HotelReservation();
        cheapHotel.findCheapestHotel();
    }
    @Test
    public void toFindTheCheapestHotel_OnWeekdayAndWeekend() {
        HotelReservation cheapHotel = new HotelReservation();
        cheapHotel.findCheapestHotel_Weekday_Weekend();
    }

}

