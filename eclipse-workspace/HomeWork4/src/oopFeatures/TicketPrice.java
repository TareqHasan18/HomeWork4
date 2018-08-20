package oopFeatures;

public class TicketPrice {
	//Polymorphism: Method Overloading (Compile time polymorphism)
	public int PriceOfTicket(int original, int tax) {
		int total = original + tax;
		return total;
	}
	
	public int PriceOfTicket(int original, int tax, int ExtraBag) {
		int total = original + tax + ExtraBag + 50;
		return total;
	}
	
	public int PriceOfTicket(int original, int tax, String name) {
		int total = (original + tax);
		return total;
	}

}
