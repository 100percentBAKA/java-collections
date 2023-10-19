import java.util.ArrayList;


public class Main
{
	public static void main(String[] args) {
		// * Declaring an ArrayList 
		ArrayList<String> arr = new ArrayList<> ();
		
		
		
		
		// * Initializing an ArrayList 
		arr.add("barbarians");
		arr.add("giants");
		
		
		
		
		String[] oldArr = {"pekka", "wizard", "archer"};
		
		
		
		
		// * Copying elements into an ArrayList 
		for (String element : oldArr) {
		    arr.add(element);
		}
		
		
		
		
		// * Accessing an element by index
		System.out.println("The element at the Index 3 is: " + arr.get(3));
		
		
		
		
		// * Modifying an element by index 
		arr.set(3, "dragon");
		System.out.println("The element at the Index 3 after Modifying is: " + arr.get(3));
		
		
		
		
		
		// * Printing elements
		// * 1) Enhanced For Loop 
		for (String element : arr) {
		    System.out.print(element + " ");
		}
		System.out.println();
		
		// * 2) forEach()
		arr.forEach(element -> System.out.print(element + " "));
		System.out.println();
		
		
		
		
		// * Searching for an element in ArrayList 
		String key = "wizard";
		if(arr.contains(key)) {
		    System.out.println(key + " found in ArrayList");
		}
		else {
		    System.out.println(key + " not found in ArrayList");
		}
	}
}
