package VehiclePackage;

public class ElectricVehicle extends Vehicle {
	private int batteryCapacity;
	private int chargeLevel;

	public void charge(int charge) {
		if (charge + chargeLevel >= 100) {
			chargeLevel = 100;
			System.out.println("The car is fully charged");
		} else {
			chargeLevel = chargeLevel + charge;
			System.out.println("The car has been charge to " + chargeLevel + "%");
		}

	}

	@Override
	public void drive(int numberOfMile) {
		System.out.println("Electric vehicle driven " + numberOfMile + " miles");
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(int chargeLevel) {
		this.chargeLevel = chargeLevel;
	}

}
