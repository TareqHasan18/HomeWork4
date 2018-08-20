package oopFeatures;

//import students.Students;

public class TestAirLines {

	public static void main(String[] args) {
		AirLine air = new Emirates();
		air.AirCraft();
		air.Office();
		air.Operation();
		
		Emirates emi = new Emirates();
		emi.Boeing();
		emi.setAirName("Emirates Airlines");
		emi.setAirID(117);
		emi.setAirService("Excellent");
		
		
		Delta cargo = new Delta();
		cargo.AirCraft();
		cargo.Office();
		cargo.Operation();
		cargo.Cargo();
		cargo.setAirName("Delta Airlines");
		cargo.setAirID(119);
		cargo.setAirService("Excellent");
		
		BoothService bos = new Emirates();
		bos.S24_7();
		bos.BoothCount();
		
		Delta dels =new DeltaShutle();
		dels.Cargo();
		
		TicketPrice Ticp = new TicketPrice();
		System.out.println(Ticp.PriceOfTicket(900, 150));
		System.out.println(Ticp.PriceOfTicket(900, 150, 100));
		System.out.println(Ticp.PriceOfTicket(900, 150));
		System.out.println("  AirLine Name    ID  Service");
		System.out.println("  ------------    --  -------");
		System.out.println(emi.getAirName()+ " " + emi.getAirID() + " " + emi.getAirService());
		System.out.println(cargo.getAirName()+ "    " + cargo.getAirID() + " " + cargo.getAirService());

	}

}
