package inheritance;

public class MakeHonda extends Bike {

	public void tyreType(){
		
		System.out.println("Tubeless tyre");

	}
	//method overriding - @Overridden
	public void startBike() {
		
		System.out.println("Self start the bike");
	}

}
