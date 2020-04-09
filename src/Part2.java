/**
 * Project Collections (Part 2)
 * @author Mark Garcia 018019103
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen 018502846
 *         brandon.wiitanen01@student.csulb.edu
 */

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Part2 {
    /**
     * This method takes in 1 argument through the command line to determine whether it will run as a TreeSet or a HashSet
     * Reads the "AliceInWonderland.txt file and puts all the individual words into a HashSet or a TreeSet.
     * It then tests how long it takes to insert the data as well as the amount of time it takes to find the word
     * "Alice" 100 times. It records this data as milliseconds.
     * @param args = either "tree" or "hash". Anything else will not run the program.
     * ANALYSIS OF RUNTIME: Using a HashSet is more efficient than using a TreeSet in this scenario.
     * Time for 1st operation using HashSet (milliseconds): 110
     * Time for 2nd operation using HashSet (milliseconds): 114
     * Time for 1st operation using TreeSet (milliseconds): 117 (+7)
     * Time for 2nd operation using TreeSet (milliseconds): 122 (+6)
     */

    public static void main(String[] args) {
        File aliceBook = new File("AliceInWonderland.txt");
        long start, end;
        int count;
        
        try {
        	Scanner ABscanner = new Scanner(aliceBook);
        	start = System.currentTimeMillis();
        	if (args[0].compareToIgnoreCase("hash") == 0) {
        		HashSet<String> words = new HashSet<String>();
        		start = System.currentTimeMillis();
        		while (ABscanner.hasNext()) {
        			words.add(ABscanner.next());        		
        		}
        		end = System.currentTimeMillis();
        		System.out.println("The total time elapsed to imsert data was " + (end - start) + "ms.");
        		count = 0;
        		for (String w : words){
        			if(w.compareToIgnoreCase("Alice") == 0){
        				if (count != 100){
        					count++;
						}
					}
				}
        		end = System.currentTimeMillis();
        		System.out.println("The total time elapsed to search for the word 'Alice' was " + (end - start) + "ms.");
        	} else if (args[0].compareToIgnoreCase("tree") == 0) {
        		TreeSet<String> words = new TreeSet<String>();
        		start = System.currentTimeMillis();
        		while (ABscanner.hasNext()) {
        			words.add(ABscanner.next());        		
        		}
        		end = System.currentTimeMillis();
        		System.out.println("The total time elapsed to imsert data was " + (end - start) + "ms.");
        		count = 0;
        		for (String w : words){
        			if(w.compareToIgnoreCase("Alice") == 0){
        				if (count != 100){
        					count++;
						}
					}
				}
        		end = System.currentTimeMillis();
        		System.out.println("The total time elapsed to search for the word 'Alice' was " + (end - start) + "ms.");
        	}
        	ABscanner.close();
        } catch (FileNotFoundException fnfe) {
        	System.out.println("The file could not be found...");
        }
        System.out.println("terminating...");
    }
}