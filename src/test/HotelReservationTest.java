package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.HotelReservation;

class HotelReservationTest {

	HotelReservation hotelReservation = new HotelReservation();

	@Test
	public void checkedGivenHotelNameandRateAreAdded_True() {
		boolean result = hotelReservation.addHotel("Lakewood", 110);
		Assertions.assertTrue(result);
	}

	@Test
	public void checkedCheapestHotel_BetweenTwoDates_ShouldTrue() {
		SimpleDateFormat dateformat = new SimpleDateFormat("ddMMMMyyyy");
		String[] inputDateString = { "10Sep2020", "11Sep2020" };
		Date inputDate[] = null;
		try {
			inputDate = new Date[] { dateformat.parse(inputDateString[0]), dateformat.parse(inputDateString[1]) };
		} catch (ParseException e) {
			System.out.println("Invalid Format");
		}
		boolean result = hotelReservation.addHotel("Lakewood", 110.00)
				&& hotelReservation.addHotel("Bridgewood", 160.00) && hotelReservation.addHotel("Ridgewood", 220.00);
		if (result)
			Assertions.assertEquals("Lakewood", hotelReservation.findCheapestHotel(inputDate));
	}

	@Test
	public void givenWeekDayAndWeekendRate_WhenAdded_ShouldMatch() {
		boolean result = hotelReservation.addHotelRates("Lakewood", 110.00, 80.00)
				&& hotelReservation.addHotelRates("Bridgewood", 160.00, 110.00)
				&& hotelReservation.addHotelRates("Ridgewood", 220.00, 100.00);
		Assertions.assertTrue(result);
	}
}