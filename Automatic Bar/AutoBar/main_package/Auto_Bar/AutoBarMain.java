package main_package.Auto_Bar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
//The purpose of this is a small application where you enter what ingredients you have
//an it tells you what kind of drinks you can make. This is the main class.

public class AutoBarMain {
	public static Scanner scanner = new Scanner (System.in);
	public static HashSet<String> listIngredients = new HashSet();
	public static ArrayList listSupportedIngredients = new ArrayList();
	
	public static void main(String[] args) {
		String input= "stop";
		System.out.println("Welcome! Please enter your ingredients. Right now, we support these ingredients");
		ArrayList<RecipeTuple> list_to_search = DrinksListSearch.main(args);		
		//This is the basic text based user interface. The user only has to enter the ingredients they have and press go
		while (!listIngredients.contains("go")) {
			System.out.println("enter another ingredients");
			input = scanner.nextLine();
			listIngredients.add(input); 
		}
		//After the inputs are given, the method uses a while loop to iterate through them
		//and find potential matches
		ListIterator<RecipeTuple> itr = list_to_search.listIterator();
		RecipeTuple current_search = new RecipeTuple();
		while (!list_to_search.isEmpty()) {
			current_search = list_to_search.get(0);
			if (listIngredients.containsAll(current_search.ingredients)){
				System.out.println("You can make a " +current_search.name +"! " + current_search.description);
				list_to_search.remove(0);
			} else {
				list_to_search.remove(0);
		
			}
		}	
	}
}
