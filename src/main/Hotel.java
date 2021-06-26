package main;

public class Hotel {
	String hotelName;
	double rates;
	private Double weekendRates;

	// Creating constructor
	public Hotel(String hotelName, double rates, Double weekendRates) {
		this.hotelName = hotelName;
		this.rates = rates;
		this.weekendRates = weekendRates;
	}

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

	public Double getWeekendRates() {
		return weekendRates;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rates=" + rates + "]";
	}
}