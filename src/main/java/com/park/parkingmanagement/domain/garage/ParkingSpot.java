package com.park.parkingmanagement.domain.garage;

import com.park.parkingmanagement.domain.vehicle.Vehicle;

public class ParkingSpot {
	private Vehicle vehicle;
	private int spotNumber;

	public boolean isAvailable() {
		return vehicle == null;
	}

	public boolean park(int spotNumber, Vehicle v) {
		this.spotNumber = spotNumber;
		vehicle = v;
		vehicle.parkInSpot(this);
		return true;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public String getSpotNumber() {
		return String.valueOf(spotNumber);
	}

	public void removeVehicle() {
		vehicle = null;
	}
}
