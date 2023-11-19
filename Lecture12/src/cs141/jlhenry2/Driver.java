package cs141.jlhenry2;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String[] owner = {"Alice", "Bob", "Carol"};
		//Array 1 for Activity 1 and 2
		
		Car[] car = new Car[3];
		//This'll create an array list 
		
		int yearModel = 0;
		String Make = "";
		//Variables Yayyyyyyyyyyyy
		
		ArraysAreFun.printArray(owner);
		//Activity #1
		System.out.println();
		System.out.print("------------------");

		
		ArraysAreFun.onList(owner);
		//Activity #2
		
		System.out.println("------------------");
		
		for (int i = 0; i < 3; i++) { //This'll make this repeat 3 times and create our array list
			System.out.println("Please enter a year model: ");
			yearModel = scnr.nextInt(); //This'll get the year model
			
			System.out.println("Please enter a make: "); //This'll get the make 
			Make = scnr.nextLine();
			Make = scnr.nextLine();
			
			car[i] = new Car(yearModel, Make);
			// This assigns car with whatever value i is 
		}
		System.out.println("------------------");
		car[0].print();
		car[1].print();// This'll print out all 3 arrays 
		car[2].print();
		System.out.println("------------------");
		
	}

}
