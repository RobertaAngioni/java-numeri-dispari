package org.generation.italy.cicli;
import java.util.Random;
import java.util.Scanner;
public class StampaNumeriDispari {

	public static void main(String[] args) {
	
		Random randomGenerator = new Random ();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lunghezza array: ");
		
		int[] array = new int[scanner.nextInt()];
				
		for (int i = 0; i < array.length; i++) {
			array[i] = randomGenerator.nextInt(99);
		}
		
		// scorro array
		for ( int j = 0; j < array.length; j++) {
			if(array[j]  % 2  != 0) {
				System.out.println(array[j]);
			}
		}
		 
	   
		

	}
}
 
 

