package oopFeatures;

public class Delta implements AirLine{
	
	private String AirName;
	public String getAirName() {
		return AirName;
	}

	public void setAirName(String airName) {
		AirName = airName;
	}

	public int getAirID() {
		return AirID;
	}

	public void setAirID(int airID) {
		AirID = airID;
	}

	public String getAirService() {
		return AirService;
	}

	public void setAirService(String airService) {
		AirService = airService;
	}

	private int AirID;
	public String AirService;
	
	public void AirCraft() {
		System.out.println("Delta also has beautiful airplane ");
	};
	
	public void Office() {
		System.out.println("Delta has more office in west than east");
	};
	
	public void Operation() {
		System.out.println("Delta operates more domestic than international");
	};
	
	public void Cargo() {
		System.out.println("Delta has cargo service in addition");
	}

	/*public void OnlyDomestic() {
		// TODO Auto-generated method stub
		
	}*/

}
