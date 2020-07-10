package JavaActivity1;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
    public Car (){ 	
    	tyres = 4;
    	doors = 4; 	
    }
	
    public void displayCharacteristics() {
    	System.out.println ("Color of the car: " + color);
    	System.out.println ("Make of the car: " + make);
    	System.out.println ("number of doors in car: " + doors);
    	
    }
    
    public void Accelerate() {
    	System.out.println("Car is moving forward");
    }
    
    public void Brake() {
    	
    	System.out.println("Car has stopped");
    }
}
