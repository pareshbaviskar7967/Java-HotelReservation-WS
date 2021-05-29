package main;

public class Hotel {
	String hotelName;
	double rates;
	// Creating constructor
	public Hotel(String hotelName, double rates) {
		this.hotelName = hotelName;
		this.rates = rates;
	}

	public String getHotelName() {
		return hotelName;
	}

	public double getRates() {
		return rates;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rates=" + rates + "]";
	}
}