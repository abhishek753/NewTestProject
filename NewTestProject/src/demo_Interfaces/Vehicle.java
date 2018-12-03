package demo_Interfaces;

public interface Vehicle {
	
	//all are the abstract methods.
	void changeGear(int a);
	void speedUp(int a);
	void applyBreaks(int a);

}

class Bicycle implements Vehicle{
	
	int speed;
	int gear;
	
	//to change gear
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
	
	//to increase speed.
	@Override
	public void speedUp(int increment) {
		
		speed = speed + increment;
	}
	
	//to decrease speed.
	public void applyBreaks(int decrement) {
		
		speed = speed - decrement;
	}
	public void printStates() {
		System.out.println("Speed: " +speed+ " Gear: " +gear);
	}
}

class Bike implements Vehicle{
	
	int speed;
	int gear;
	
	//to chnage gear
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
	//to increase speed.
		@Override
		public void speedUp(int increment) {
			
			speed = speed + increment;
		}
		
		//to decrease speed.
		public void applyBreaks(int decrement) {
			
			speed = speed - decrement;
		}
		public void printStates() {
			System.out.println("Speed: " +speed+ " Gear: " +gear);
		}
}

class GFG{
	
	public static void main(String[] args) {
		
		//creating an instance of Bicycle
		//doing some operations.
		
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(3);
		bicycle.applyBreaks(2);
		bicycle.speedUp(7);
		
		System.out.println("Bicycle present state");
		bicycle.printStates();
		
		
		//creating instance of Bike.
		
		Bike bike = new Bike();
		bike.changeGear(9);
		bike.applyBreaks(4);
		bike.speedUp(8);
		
		System.out.println("Bike present state");
		bike.printStates();
		
	}
}
