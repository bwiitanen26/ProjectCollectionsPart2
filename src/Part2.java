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