import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Part2 {

    public static void main(String[] args) {
        File aliceBook = new File("AliceInWonderland.txt");
        long start, end;
        int count;
        
        try {
        	Scanner ABscanner = new Scanner(aliceBook);
        	start = System.nanoTime();
        	if (args[0].compareToIgnoreCase("hash") == 0) {
        		HashSet<String> words = new HashSet<String>();
        		start = System.nanoTime();
        		while (ABscanner.hasNext()) {
        			words.add(ABscanner.next());        		
        		}
        		end = System.nanoTime();
        		System.out.println("The total time elapsed to insert data was " + (end - start) + "ns.");
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
        	} else if (args[0].compareToIgnoreCase("tree") == 0) {
        		TreeSet<String> words = new TreeSet<String>();
        		start = System.nanoTime();
        		while (ABscanner.hasNext()) {
        			words.add(ABscanner.next());        		
        		}
        		end = System.nanoTime();
        		System.out.println("The total time elapsed to insert data was " + (end - start) + "ns.");
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
        System.out.println("terminating...");
    }
}