package Tasks;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int Attempts = 5;
	        int rounds = 3;
	        int score = 0;

	        for (int round = 1; round <= rounds; round++) {
	            System.out.println("\nRound " + round);

	            int numberToGuess = random.nextInt(10) + 1;
	            int attempts = 0;

	            while (attempts < Attempts) {
	                System.out.print("Guess a number between 1 and 100: ");
	                int guess = scanner.nextInt();
	                attempts++;

	                if (guess == numberToGuess) {
	                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	                    score++;
	                    break;
	                } else if (guess < numberToGuess) {
	                    System.out.println("Too low. Try again.");
	                } else {
	                    System.out.println("Too high. Try again.");
	                }
	            }

	            if (attempts == Attempts) {
	                System.out.println("You've reached the maximum number of attempts. The number was " + numberToGuess);
	            }
	        }

	        System.out.println("\nGame Over! Your final score is: " + score + "/" + rounds);
	        scanner.close();
	    }

}
