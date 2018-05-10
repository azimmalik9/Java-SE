public class Vehicle {

	private String make;
	private String model;
	private double price;

	public Vehicle(String v_make, String v_model, double v_price) {
		make = v_make;
		model = v_model;
		price = v_price;
	}

	public String getVehicleName() {
		return make + " " + model;
	}
	
	public double price()
	{
		return price;
	}

	public String toString()
	{
		String result;
		
		result = "Vehicle Name : "+ getVehicleName() + "\nPrice : " +price;
		return result;
		
	}
}
