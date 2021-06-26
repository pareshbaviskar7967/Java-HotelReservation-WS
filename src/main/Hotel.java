package main;

public class Hotel {
	String hotelName;
	double rates;
	String weekday;
    String weekend;
    
	// Creating constructor
    public Hotel(String hotelName,String weekday, String weekend)
    {
        this.hotelName=hotelName;
        this.weekday=weekday;
        this.weekend=weekend;
    }

	public Hotel(String hotelName, double rates) {
		this.hotelName = hotelName;
		this.rates = rates;
	}
}