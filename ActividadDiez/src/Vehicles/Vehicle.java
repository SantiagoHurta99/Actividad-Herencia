package Vehicles;

/**
 * @author Santiago Hurtado
 */

public class Vehicle {
	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	
	private String chassisNo;
	private String model;
	
	public Vehicle(String model) {
		numVehicles += 1;
		chassisNo = "ch" + numVehicles;
		this.model = model;
		System.out.println("Vehicle manufactured");
	}
	
	public static class Engine extends Vehicle {
		public static final String MAKE = "Predicter"; 
		public static final int CAPACITY = 1600;
		
		public Engine(String model) {
			super(model);
		}
		
		public static String getMake() {
			return MAKE;
		}
		public static int getCapacity() {
			return CAPACITY;
		}
		
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static void setMAKE(String newMAKE) {
		MAKE = newMAKE;
	}

	@Override
	public String toString() {
		return "Marca: " + MAKE + "\nModelo: " + model + "\nNumero de chasis: " + chassisNo + "\nMarca del motor: " + Engine.MAKE/*getMake()*/ + "\nmodelo del motor: " + Engine.CAPACITY/*getCapacity()*/ + "cc";
	}
	
	public static String calcularCochesCreados() {
		return "Number of vehicles manufactured: " + numVehicles;		
	}
}
