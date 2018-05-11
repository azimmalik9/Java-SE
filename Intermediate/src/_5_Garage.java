import java.util.ArrayList;

public class _5_Garage {
	public static void main(String[] args) {

		_5_Vehicle myCar = new _5_Car();
		_5_Vehicle myBus = new _5_Bus();
		_5_Vehicle myBike = new _5_Motorcycle();
		
		ArrayList<_5_Vehicle> vehicle = new ArrayList<_5_Vehicle>();
		vehicle.add(myCar);
		vehicle.add(myBus);
		vehicle.add(myBike);

		for (_5_Vehicle output : vehicle) {
			System.out.println("My " + output.getVehicleType() + " has " + output.getNumberOfSeats() + " seats.");
			System.out.println("My " + output.getVehicleType() + " has " + output.getNumberOfWheels() + " wheels.");
		}
	}

}
