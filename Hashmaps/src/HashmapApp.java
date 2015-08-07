import java.util.HashMap;
import java.util.Scanner;

public class HashmapApp {
	@SuppressWarnings("resource")
	public static void main( String[] args)
	{
		int number;
		String value;
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "You entered 1");
		map.put(2, "You entered 2");
		map.put(3, "You entered 3");
		map.put(4, "You entered 4");
		map.put(5, "You entered 5");
		map.put(6, "You entered 6");
		map.put(7, "You entered 7");
		map.put(8, "You entered 8");
		map.put(9, "You entered 9");
		map.put(10, "You entered 10");
		
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.println("Prompt: Enter a number: ");
			number = sc.nextInt();
			if (number > 1 && number <= 10)
			{
				System.out.println("Response: You entered " +map.get(number));
			}
			else
			{
				System.out.println("Response: This number is not in the map\n"
									+ "Please add it to the map\n");
				System.out.println("Enter the string value for this number: ");
				value = sc.next();
				map.put(number,value);
				
				System.out.println("Response: You entered " +map.get(number));
				
			}
				System.out.print("Would you like to try again? Y/N: ");
		        choice = sc.next();
		        System.out.println();			
	     
		}

	}

}
