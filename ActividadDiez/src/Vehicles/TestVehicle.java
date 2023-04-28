package Vehicles;

/**
 * @author Santiago Hurtado
 */

public class TestVehicle {
	public static void main(String[] args) {
		System.out.println("Manufacturer: " + Vehicle.MAKE);
		System.out.println(Vehicle.calcularCochesCreados());
		
		Vehicle vehicle1 = new Vehicle("Vision");
//		System.out.println("ChassisNo: " + vehicle1.getChassisNo());
		System.out.println(vehicle1.toString());
		
		Vehicle vehicle2 = new Vehicle("Edict");
		System.out.println(vehicle1.toString());
		System.out.println(vehicle2.toString());
		System.out.println(Vehicle.calcularCochesCreados());
		
		vehicle2.setMAKE("Seer");
		System.out.println(vehicle1.toString());
		System.out.println(vehicle2.toString());
		System.out.println(Vehicle.calcularCochesCreados());
		
		Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
		System.out.println("Vehicle number " + vehicle3.getChassisNo() + " is a " + vehicle3.getModel() + " model and has an engine capacity of " + vehicle3.getCapacity() + "cc");
	}
}
