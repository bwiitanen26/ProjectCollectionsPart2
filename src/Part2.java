import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Part2 {

    public static void main(String[] args) {
        //initialize variables to be used
    	Scanner input = new Scanner(System.in);
        File aliceBook = new File("AliceInWonderland.txt");
        long start, end;
        int count;
        
        try {
        	Scanner ABscanner = new Scanner(aliceBook);
        	System.out.println("Which data type would you like to test?(Enter 'tree' or 'hash')");
        	//String uInput = input.nextLine();
        	//System.out.println(uInput);
        	if (input.nextLine() == "hash") {
        		System.out.println("starting if statement");
        		HashSet<String> words = new HashSet<String>();
        		System.out.println("hashset created");
        		start = System.nanoTime();
        		System.out.println(start);
        		while (ABscanner.hasNext()) {
        			words.add(ABscanner.next());        		
        		}
        		end = System.nanoTime();
        		System.out.println("The total time elapsed to insert data was " + (end - start) + "ns.");
        		start = System.nanoTime();
        		count = 0;
        		while (count < 100) {
        			for (String word : words) {
        				if (word == "Alice") {
        					count += 1;
        				}
        			}
        		}
        		end = System.nanoTime();
        		System.out.println("The total time elapsed to search for the word 'Alice' was " + (end - start) + "ns.");
        	} else if (input.nextLine() == "tree") {
        		TreeSet<String> words = new TreeSet<String>();
        		start = System.nanoTime();
        		while (ABscanner.hasNext()) {
        			words.add(ABscanner.next());        		
        		}
        		end = System.nanoTime();
        		System.out.println("The total time elapsed to insert data was " + (end - start) + "ns.");
        		start = System.nanoTime();
        		count = 0;
        		while (count < 100) {
        			for (String word : words) {
        				if (word == "Alice") {
        					count += 1;
        				}
        			}
        		}
        		end = System.nanoTime();
        		System.out.println("The total time elapsed to search for the word 'Alice' was " + (end - start) + "ns.");
        	}
        	ABscanner.close();
        } catch (FileNotFoundException fnfe) {
        	System.out.println("The file could not be found...");
        }
        input.close();
        System.out.println("terminating...");
    }
}