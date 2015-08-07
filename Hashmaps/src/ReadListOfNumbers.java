import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ReadListOfNumbers {

	public static void main(String[] args) {

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
		
		
		//get a filename
		System.out.println((System.getProperty("user.dir") + File.separatorChar +"mybooks.txt"));
		String filename = (System.getProperty("user.dir") + File.separatorChar +"mybooks.txt");
		
		System.out.println(Paths.get("c:\\myfolder\\myfile.txt"));
				
		
		
		//write file
		//Data can be output to a text file using the class PrintWriter
		//This class includes the methods print and println that you have
		//already used for terminal output
		//A PrintWriter is opened like a Scanner
		//you must handle the FileNotFound Exception
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new File(filename));
			
				writer.println("Map " +map.toString());
		
		//you must close the PrintWriter
		writer.close();
		
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			System.out.println("Read in list of numbers");
//		    numbers = readLines(new File(filename));
//			for( map:numbers)
//			{
				System.out.println(map.toString());
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//You can see how many items are in your list by using the size method
		System.out.println();
		System.out.println("How many elements are in your list?");
		System.out.println(map.size());
		
		
		//add a new number
		map.put(11,"You entered 11");
		//delete the 1st number
		map.remove(1);
		//the Collections class contains static methods like sort
		//that work on collections
		List keys = new ArrayList(map.keySet());
		Collections.sort(keys); //use extracted instead
		
		//print your sorted collection of numbers
		System.out.println();
		System.out.println(" -- sorted numbers --");
		
			System.out.println(map.toString());
		
		
		//another way to print a collection
		System.out.println();
		System.out.println("Another way to print a collection");
		System.out.println(map);
		
		//replace number 2 with your name
		map.replace(2, "Bart Simpson");
		
		//unsort the list now
		Collections.shuffle(keys);
		System.out.println();
		System.out.println(" -- unsorted books --");
		
			System.out.println(map.toString());
		

	}
	 public static HashMap<Integer,String> readLines(File file) throws Exception {
	      if (!file.exists()) {
	          return new HashMap<Integer,String>();
	      }
	      BufferedReader reader = new BufferedReader(new FileReader(file));
	      HashMap<Integer,String> results = new HashMap<Integer,String>();
	      String line = reader.readLine();
	      while (line != null) {
	          results.get(line);
	          line = reader.readLine();
	      }
	      reader.close();
	      return results;
	  }

} 
