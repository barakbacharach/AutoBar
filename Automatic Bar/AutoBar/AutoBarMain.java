import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
//The purpose of this is a small application where you enter what ingredients you have
//an it tells you what kind of drinks you can make

public class AutoBarMain 
{
	public static Scanner scanner = new Scanner (System.in);
	public static HashSet<String> listingredients = new HashSet();
	public static ArrayList listsupportedingredients = new ArrayList();
	
	public static void main(String[] args) {
String input= "stop";
System.out.println("Welcome! Please enter your ingredients. Right now, we support these ingredients");
ArrayList<Recipe_Tuple> list_to_search = Drinks_List_Search.main(args);

//This is the very basic text based user interface. The user only has to enter the ingredients they have and press go
while (!listingredients.contains("go")){
	System.out.println("enter your ingredients");
	input = scanner.nextLine();
	listingredients.add(input); 
		}


ListIterator<Recipe_Tuple> itr = list_to_search.listIterator();
Recipe_Tuple current_search = new Recipe_Tuple();
while (!list_to_search.isEmpty()) {
	current_search = list_to_search.get(0);
	ArrayList<String> test = new ArrayList();
	test.add("vermouth");
	test.add("vodka");
	if (listingredients.containsAll(current_search.ingredients)			){
		System.out.println("You can make a " +current_search.name +"! " + current_search.description);
		list_to_search.remove(0);
	}
	else {
		list_to_search.remove(0);

	}
}

//if (listingredients.contains("gin") && listingredients.contains("vermouth")){
//	System.out.println ("You can make a martini! Mix 2 parts gin and 1 part vermouth in a shaker over ice. Pour into a martini glass");
//}
//HashSet test = new HashSet();
//test.add("vodka");
//test.add ("vermouth");
//if (listingredients.containsAll(test)){
//	System.out.println ("You can make a vodka martini! Mix 2 parts vodka and 1 part vermouth in a shaker over ice. Pour into a martini glass");
//}
//if (listingredients.contains("rum") && listingredients.contains("coke")){
//	System.out.println ("You can make a cuba libre! Mix 1 part rum and a glass of coke in a highball with ice");
//}
}
}
//	