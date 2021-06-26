package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class HotelReservation {
	// Creating Arraylist for hotels
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	ArrayList<Hotel> hotelList1 = new ArrayList<Hotel>();

	// Creating addHotel function with arguments
	public boolean addHotel(String hotelName, double rates) {
		Hotel hotel = new Hotel(hotelName, rates);
		System.out.println(hotelList.isEmpty());
		// Adding hotel in Arraylist
		hotelList.add(hotel);
		return !hotelList.isEmpty();
	}

	// Creating findCheapestHotel function
	public boolean findCheapestHotel(String date11, String date22) {
		try {
			DateFormat format = new SimpleDateFormat("dd mm yyyy");
			Date date1 = format.parse(date11);
			Date date2 = format.parse(date22);
			long daysBetween = ChronoUnit.DAYS.between(date1, date2);
			getTotalRateForDays(daysBetween);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void getTotalRateForDays(long DaysBetween) {
		try {
			for (int i = 0; i < hotelList.size(); i++) {
				double totalAmountForstayingDates = DaysBetween * hotelList.get(i).rates;
				System.out.println(hotelList.get(i).hotelName + "==> " + totalAmountForstayingDates);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error");
		}
	}

	public boolean addHotelWeekendWeekDay(String hotelName, String weekday, String weekend) {
		Hotel hotel = new Hotel(hotelName, weekday, weekend);
		hotelList1.add(hotel);

		if (hotelList1.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}