package week3.day1;

public class MyCar {

	public static void main(String[] args) {
 
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		BMW bmw = new BMW();
		
		vehicle.applyBrake();
		vehicle.soundHorn();
		car.handBrake();
		car.turnAC();
		bmw.autoPark();
		
	}

}
