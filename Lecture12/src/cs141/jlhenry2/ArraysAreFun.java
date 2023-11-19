package cs141.jlhenry2;
import java.util.*;

public class ArraysAreFun {
	
	
	public ArraysAreFun(){
		
	}
	
	public static void printArray(String name[]){
		
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " "); 
			//This'll print out the array of the 3 names
		} // Activity Number 1 ^^^
		
	}
	
	public static void onList(String owner[]) {
		Scanner scnr = new Scanner(System.in);

		boolean found = false;
		String list;
		// Variables yayyyyyyyyyyyyyy
		
		System.out.println();
		System.out.println("Who are you looking for? ");
		list = scnr.nextLine();
		//This gets the user input(who they want to find)
		System.out.println("------------------");


		for (int i = 0; i < owner.length; i++) { 
			//the for loop will go though the array 
			if(owner[i].equals(list)) { //If it finds the owner...
				//it prints and labels found as true
				found = true;
				System.out.println(list + " is on the list.");
			}
		}
		//else outside of the for loop it prints the other one  
		if(found == false) {
			System.out.println(list + " is not on the list.");
		}
		
		
	}

}
