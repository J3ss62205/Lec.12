package cs141.jlhenry2;

public class Car {
	private int yearModel;
	private String make;
	
	public Car(int yearModel, String make) {
		this.yearModel = yearModel; //This sets the year model and the make 
		this.make = make; //For the array
	}
	
	public int getYrModel() {
		return yearModel; //getter 
	}
	
	public String getMake() {
		return make; // also a getter
	}
	
	public void print() {
		System.out.println("Car make: " + make);	
		System.out.println("Year model: " + yearModel); 
		// This will print the year model and make
		
	}

}
