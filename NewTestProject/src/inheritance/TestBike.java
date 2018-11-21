package inheritance;

public class TestBike {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.color = "White";
		b.startBike();
		
		MakeHonda m = new MakeHonda();
		m.color = "Black";
		m.startBike();
		m.tyreType();
		
		Bike b1 = new MakeHonda();
		b1.startBike();
		b1.stopBike();

	}

}
