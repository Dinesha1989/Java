
package JavaActivity1;

public class Activity1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing object
		Car toyota = new Car();
		
		toyota.make = 2014;
		toyota.color = "Balck";
		toyota.transmission = "Manual";
		
		toyota.displayCharacteristics();
		toyota.Accelerate();
		toyota.Brake();
		
	}

}
