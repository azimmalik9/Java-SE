public abstract class _5_Vehicle {

	public String vehicleType;

	public Integer getNumberOfSeats() {
		if (this.vehicleType.equals("Car")) {
			return 5;
		}
		if (this.vehicleType.equals("Bus")) {
			return 20;
		}
		if (this.vehicleType.equals("Motorcycle")) {
			return 1;
		}

		return null;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}

	public abstract Integer getNumberOfWheels();

}
