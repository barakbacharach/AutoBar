import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//This is the basic class for which drinks are stored in the database.
//The ingredients section is a set for which all the ingredients are stored. This is 
//checked against the set of ingredients the user inputs.
// The description is where the user inputs instructions for making the drink.
// The name is the name. eg Martini.
public class Recipe_Tuple {
	public HashSet<String> ingredients;
	public  String description;
	public  String name;
	public static void main(String[] args) {
		
	}
	
	public void create_recipe(String drink_name,String new_description, String string_ingredients){
		//A very simple constructor to make the drink tuple. One merely adds the name, then description
		//then the ingredients as a string with dashes seperating. Make sure not to add spaces.
		// Example: create_recipe("martini", "one part gin, a bit of vermouth, olive for garnish", "gin-vermouth"
		description= new_description;
		name=drink_name;
		//String[] temp_array= string_ingredients.split("/S");
		ArrayList<String> templist = new ArrayList<String>(Arrays.asList(string_ingredients.split("-")));
		//ingredients.addAll(Arrays.asList(temp_array));
		HashSet<String> tempset= new HashSet<String>();
//		while (!templist.isEmpty()){
//			tempset.add(templist.get(0));
//			templist=templist.subList(1,templist.size());
//		}
		tempset.addAll(templist);
		ingredients=tempset;

	}
	

		
		
}