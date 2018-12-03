package edu.gcu.bootcamp.java.kymbrlee.hsu.shopper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
	
public abstract class MyList {
	public  static Scanner scanner = new Scanner(System.in);
	List<String> myList = new ArrayList<String>();
	private String item;

	public String getItem() {
		return item;
	}

		
			
	public void addItem() {
		
		System.out.println("Enter an item: ");
		String item =scanner.nextLine();
		  myList.add(item);
	
		}
	/*
	 * this method is for adding item if it is not already on the list
	 * when using the "check to see if on list" method.
	 */
	public void addItem(String item) {
		myList.add(item);
	}
	
	public void removeItem() {
		System.out.println("What item to remove?");
		String item =scanner.nextLine();
		myList.remove(item);	
				
				
			}

	public void checkItemOnList() {
		System.out.println("What item would you like to search");
		String searchItem = scanner.nextLine();
		
		boolean hasItem = myList.contains(searchItem);
	
		if(hasItem == true) {
			System.out.println("Item is already on list.");
			
		}else {
			addItem(searchItem);
		}
	
	}
	public void displayList() {
		System.out.print("Here are the items on your list"+ myList.size());
		for (int i = 0; i < myList.size(); i ++) {
			System.out.print((i +1) + myList.get(i));
		}
		
	}
	/*
	 * sorts by alphabetical order
	 */
	public void sortItems() {
		Collections.sort(myList);
		System.out.println("Here are the items on your list \n");
		for(String item : myList) {
			System.out.println(item);
		}
		
		
	}

	}

