package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class HotelReservation {
	// Creating Arraylist for hotels
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	// Creating addHotel function with arguments
	public boolean addHotel(String hotelName, double rates) {
		Hotel hotel = new Hotel(hotelName, rates);
		System.out.println(hotelList.isEmpty());
		// Adding hotel in Arraylist
		hotelList.add(hotel);
		return !hotelList.isEmpty();
	}

	// Creating findCheapestHotel function
	public String findCheapestHotel(Date[] dates) {
		ArrayList<Double> cheapRateHotels = new ArrayList<>();
		for (Hotel hotel : hotelList) {
			Double rate = 0.0;
			for (Date date : dates) {
				rate = hotel.getRates();
			}
			cheapRateHotels.add(rate);
		}
		Double cheap = cheapRateHotels.stream().min(Comparator.comparing(Double::doubleValue)).orElse(null);
		int index = cheapRateHotels.indexOf(cheap);
		return hotelList.get(index).getHotelName();
	}

	public boolean addHotelRates(String name, double weekday, double weekend) {
		Hotel hotel = new Hotel(name, weekday, weekend);
		hotelList.add(hotel);
		return !hotelList.isEmpty();
	}
}