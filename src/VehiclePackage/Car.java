package VehiclePackage;

public class Car extends Vehicle {
	private int numberOfDoors;

	public void openTrunk() {
		System.out.println("Trunk opend");
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
