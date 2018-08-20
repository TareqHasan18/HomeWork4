package oopFeatures;

public class Emirates extends BoothService implements AirLine {
	//Inheritance is the mechanism in java by which one class is allow 
	//to inherit the features(fields and methods) of another class.
	//here subclass "Emirates" inherits the methods of super class "BoothService".
	//so this is inheritance.
	
	private String AirName;
	private int AirID;
	public String AirService;
	
	public String getAirName() {
		return AirName;
	}

	public void setAirName(String airName) {
		this.AirName = airName;
	}

	public int getAirID() {
		return AirID;
	}

	public void setAirID(int airID) {
		this.AirID = airID;
	}

	public String getAirService() {
		return AirService;
	}

	public void setAirService(String airService) {
		this.AirService = airService;
	}


	
	public void AirCraft() {
		System.out.println("Emirates has nice aircrafts");
	};
	
	public void Office() {
		System.out.println("They have office in evrey country");
	};
	
	public void Operation() {
		System.out.println("They operate internationally more than domestic");
	};
	
	public void Boeing() {
		System.out.println("Emirates has more boeing than small aircraft");
	}

	
	public void S24_7() {
		System.out.println("They have strong and nice 24/7 online support");
		
	}


	public void BoothCount() {
	System.out.println("Emirates has a good number of booth in every airport");
		
	}

}
