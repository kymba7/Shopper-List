package edu.gcu.bootcamp.java.kymbrlee.hsu.shopper;


import java.util.Scanner;

public class GroceryList extends MyList{
	
	Scanner scanner = new Scanner(System.in);
	
/*
 * Displays options for the grocery list 
 */
	public void displayGroceryList() {
		
	int option;

	do {
		System.out.println("=======================================");
		System.out.println("            Grocery List");
		System.out.println("=======================================");
		System.out.println("Pick an option: ");
		System.out.println("-----------------------");
		System.out.println(" 1: : Add Item");
		System.out.println(" 2: : Remove Item");
		System.out.println(" 3: : Check Item on List");
		System.out.println(" 4: : Sort Items");
		System.out.println("------------------------");
		System.out.println(" 9: : Exit");

		option = scanner.nextInt();
		this.actionMenu(option);

	} while (option != 9);
}
	/*
	 * depending on the option it will go to different methods
	 */
	public void actionMenu(int option) {
	

		if (option == 1) {
			this.addItem();

		}else if
			(option == 2) {
			this.removeItem();

		}else if
			(option == 3) {
		 this.checkItemOnList();

		}else if
			(option == 4) {
			this.sortItems();
			
		}else if
			(option == 9) {
			this.displayExitScreen();

		}else
			System.out.println("Wrong Entry");
	}
	//This displays the grocery list
	public void displayExitScreen() {
		System.out.println("SHOPPING LIST\n");
		for(String item : myList) {
			System.out.println(item);
		}
		
			
			
		}
	}
	
	
	
	

	
		
	
	

