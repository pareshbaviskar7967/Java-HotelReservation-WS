package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.HotelReservation;

class HotelReservationTest {

	HotelReservation hotelReservation = new HotelReservation();

	@Test
	public void checkedGivenHotelNameandRateAreAdded_True() {
		boolean result = hotelReservation.addHotel("Lakewood", 110, 3);
		Assertions.assertTrue(result);
	}

}