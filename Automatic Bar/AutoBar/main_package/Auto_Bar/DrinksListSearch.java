package main_package.Auto_Bar;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DrinksListSearch {
/*This is the database object. The main is the database, which is complied every time.
More on that design decision below. This class contains only an easy method for 
inputting different recipes and the actual database itself.*/
	
	public static ArrayList<RecipeTuple> listRecipes = new ArrayList();
	public static HashSet<String> currentIngredients = new HashSet();
	
	public static ArrayList main(String args[]) {
		RecipeTuple test = new RecipeTuple();
		addRecipe("martini", "Mix one part gin and a bit of vermouth in a shaker. "
				+ "Pour into a martini glass, add an olive for garnish", "gin-vermouth");
		addRecipe("vodka martini", "Mix one part gin and a bit of vodka in a shaker. "
				+ "Pour into a martini glass, add an olive for garnish", "vodka-vermouth");
		addRecipe("cuba libre", "Mix rum and coke in a highball with ice", "rum-coke");
		addRecipe("rusty nail", "Mix equal parts scotch and drambuie in a glass witch ice",
				"scotch-drambuie");
		addRecipe("manhattan perfect", " (Note -- this is the best way. Anyone who calls this "
				+ "snobby is an idiot. Mix two parts bourbon, one part dry vermouth, and 2/3-1 part"
				+ " sweet vermouth depending on desired sweetness in a shaker with ice. Pour into a"
				+ " martini glass with a tiny bit of bitters and stir. Garnish with lemon",
				"bourbon-vermouth-bitters");
		addRecipe("negroni", "Mix one part gin with one part sweet vermouth and one part campari "
				+ "over ice in a lowball",	"gin-vermouth-campari");
		addRecipe("rob roy", "Mix two parts scotch with one part sweet vermouth, or if you'd prefer"
				+ " dry vermouth, or a combination of the two in a shaker over ice. "
				+ "Pour into a martini glass, add a dash of bitters and stir",
				"scotch-vermouth-bitters");
		addRecipe("mojito", "Muddle half a lime, cut into four slices slices and a very generous"
				+ " helping of mint with simple syrup in a thick bottomed glass. Add one helping of"
				+ " rum, a generous pour of seltzer, and more simple syrup if desired", 
				"rum-lime-mint-simple syrup-seltzer");
		addRecipe("old fashioned", "Add one teaspoon of sugar to a lowball with a sprinkling of bitters and a dash of water."
				+ " Crush this together with a spoon, then add one serving of bourbon or rye and ice. Stir for 20 seconds."
				+ "Garnish with an orange and serve.", "bourbon-bitters");
		addRecipe("whiskey sour", "Shake 3 parts whiskey (any kind, but bourbon is traditional),"
				+ " 2 parts lemon juice, one part simple syrup, and optionally a bit of egg white"
				+ " in a shaker with ice. Strain over rocks or straight up with a "
				+ "cherry or orange garnish.", "whiskey-lemon juice-simple syrup");
		addRecipe("tom collins/gin fizz", "Stir 3 parts gin, 2 parts lemon juice, and one part"
				+ " syrup in a tall glass with ice. Pour seltzer to taste.",
				"gin-lemon juice-seltzer-simple syrup");
		addRecipe("americano", "Stir equal parts vermouth and campari in a lowball glass, "
				+ "and add a splash of seltzer", "vermouth-campari");
		addRecipe("screwdriver", "Stir 2 parts orange juice for every 1 part vodka"
				+ " in a highball with ice", "vodka-orange juice");
		addRecipe("sidecar", "Shake 2 parts cognac, 1 part triple sec, and 1 part lemon juice"
				+ " with ice. Strain into a cocktail glass", "cognac-triple sec-lemon juice");
		addRecipe("cosmopolitan", "Shake 3 parts vodka, 2 parts cranberry juice, 1 part triple sec"
				+ " and 1 part lime juice strain into a cocktail glass and serve",
				"vodka-cranberry juice-triple sec-lime juice");
		addRecipe("long island iced tea. If you want to get drunk quickly, this is the "
				+ "drink for you!", "mix 1 part tequila, 1 part vodka, 1 part rum, 1 part gin,"
				+ " and 1 part triple sec in a glass with ice finish the rest with coke", 
				"tequila-vodka-gin-rum-triple sec-coke");
		addRecipe("tequila sunrise", "Pour 4 parts tequila and 6 parts orange juice into a glass "
				+ "fillied with ice Next pour one part grenadine into the glass and serve.", 
				"tequila-orange juice- grenadine)");
		addRecipe("seabreeze", "mix one-two parts vodka, 4 parts cranberry juice, and"
				+ "one part grapefruit juice in a highball with ice.", 
				"vodka-cranberry juice-grapefruit juice");
		System.out.println(currentIngredients);
		return listRecipes;
	}
	
	public static void addRecipe(String drink_name, String drink_recipe, String drink_ingredients){
	/*This is to be used as the main constructor class. I chose this method because even though
	  it requires more computational power than manually inputting each recipe,
	  it is much easier for a non-user to operate, and the change in computational power
	  appears to be negligble, because this is a small method without any loops or recursion.*/
		RecipeTuple temp = new RecipeTuple();
		ArrayList<String> templist = new ArrayList<String>(Arrays.asList(drink_ingredients.split("-")));
		temp.createRecipe(drink_name, drink_recipe, drink_ingredients);
		listRecipes.add(temp);
		currentIngredients.addAll(temp.ingredients);
	}
}
	