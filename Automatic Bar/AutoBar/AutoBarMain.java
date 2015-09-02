import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
//The purpose of this is a small application where you enter what ingredients you have
//an it tells you what kind of drinks you can make. This is the main class.

public class AutoBarMain 
{
	public static Scanner scanner = new Scanner (System.in);
	public static HashSet<String> listingredients = new HashSet();
	public static ArrayList listsupportedingredients = new ArrayList();
	
	public static void main(String[] args) {
String input= "stop";
System.out.println("Welcome! Please enter your ingredients. Right now, we support these ingredients");
ArrayList<Recipe_Tuple> list_to_search = Drinks_List_Search.main(args);

//This is the basic text based user interface. The user only has to enter the ingredients they have and press go
while (!listingredients.contains("go")){
	System.out.println("enter another ingredients");
	input = scanner.nextLine();
	listingredients.add(input); 
		}


ListIterator<Recipe_Tuple> itr = list_to_search.listIterator();
Recipe_Tuple current_search = new Recipe_Tuple();
while (!list_to_search.isEmpty()) {
	current_search = list_to_search.get(0);
	if (listingredients.containsAll(current_search.ingredients)			){
		System.out.println("You can make a " +current_search.name +"! " + current_search.description);
		list_to_search.remove(0);
	}
	else {
		list_to_search.remove(0);

	}
}

}
}
