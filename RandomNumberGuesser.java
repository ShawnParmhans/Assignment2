/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Random Number Guesser
 * Due: 2/27/2023
 * Platform/compiler:
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Shawn Parmhans
*/

import java.util.Scanner;
import java.util.Random;

/**
 * This is the utility class to accompany RandomNumberGuesser class.
 * It contains static methods to generate a random number, validate the guesses as being between
 * the previous low and high guesses, and maintain the number of guesses.
 * 
 * @author Farnaz Eivazi
 * @version 12/8/2022
 */
public class RandomNumberGuesser {
	private static int count;
	private static final int MAX_GUESS = 7;

	/**
	 * Sets the count to zero
	 */
	public static void resetCount() {
		count = 0;
	}

	/**
	 * Generates a random integer between 1 and 100
	 * 
	 * @return the random number as an integer
	 */
	public static int rand() {
		Random rand = new Random();
		int randInt = rand.nextInt(100) + 1;
		return randInt;
	}

	/**
	 * Checks that nextGuess is strictly between lowGuess and highGuess inclusive
	 * 
	 * @param nextGuess
	 * @param lowGuess
	 * @param highGuess
	 * @return a boolean, true if the guess is with the bounds, false otherwise
	 */
	public static boolean inputValidation(int nextGuess, int lowGuess, int highGuess) {
		if (nextGuess >= highGuess || nextGuess <= lowGuess) {
			System.out.println("  >>>Guess must be between " + lowGuess + " and " + highGuess + ".  Try again");
			return false;
		}	
		return true;
	}

	/**
	 * Gets the number of guesses
	 * 
	 * @return an integer, the current value of count
	 */
	public static int getCount() {
		return count;
	}
	
	/**
	 * Increments the number of guesses
	 * 
	 */
	public static void incrementCount() {
		count++;
	}
	
	/**
	 * Gets the value of the MAX_GUESS attribute
	 * 
	 * @return an integer, the max value of count
	 */
	public static int getMaxGuessCount() {
		return MAX_GUESS;
	}
	
	    public static void main(String args[])
	    {
	        Scanner input = new Scanner(System.in);
	        int randNum, nextGuess, highGuess, lowGuess,p=0;
	        //welcome message
	        System.out.println("Welcome To Random Number Guesser!");
	        do
	        {
	        //reset the count and set rules
	        RandomNumberGuesser.resetCount();
	        randNum= RandomNumberGuesser.rand();
	        highGuess=100;
	        lowGuess=1;
	        System.out.println("We have generated a random number between 1 and 100 and you have to guess it!");
	        //user will guess number
	        do
	        {
	            System.out.println("Enter your guess: ");
	            nextGuess=input.nextInt();
	            if(RandomNumberGuesser.inputValidation(nextGuess, lowGuess, highGuess))
	            {
	                if(nextGuess<=randNum && (randNum-nextGuess)<(randNum-lowGuess))
	                {
	                    lowGuess=nextGuess;
	                    incrementCount();
	                    System.out.println("Number of guesses is: "+RandomNumberGuesser.getCount());
	                }
	                if(nextGuess>=randNum && (nextGuess-randNum)<(highGuess-randNum))
	                {
	                    highGuess=nextGuess;
	                    incrementCount();
	                    System.out.println("Number of guesses is: "+RandomNumberGuesser.getCount());
	                }
	            }
	        }while(nextGuess!=randNum);
	        System.out.println("Congrats!, you guessed correctly: \nTry again? (1 for yes 2 for no:");
	        p=nextGuess=input.nextInt();
	        }while(p==1);
	        System.out.println("Programmer: Shawn Parmhans");
	    }
}



