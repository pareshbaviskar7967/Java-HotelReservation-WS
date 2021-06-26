package main;

import java.util.ArrayList;

public class HotelReservation {
	// Creating Arraylist for hotels
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	// Creating addHotel function with arguments
	public boolean addHotel(String hotelName, int rates, int rating) {
		Hotel hotel = new Hotel(hotelName, rates, rating);

		// Adding hotel in Arraylist
		return hotelList.add(hotel);
	}
}