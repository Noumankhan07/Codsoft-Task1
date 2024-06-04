import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(101); // Generate a random number between 0 and 100
        int attempts = 0;
        int score = 100; // Initial score
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 0 and 100:");

        while (!hasGuessedCorrectly) {
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                System.out.println("Your total score: " + score);
            } else if (guess < secretNumber) {
                System.out.println("Try a higher number.");
                score -= 10; // Deduct 10 points for each incorrect guess
            } else {
                System.out.println("Try a lower number.");
                score -= 10; // Deduct 10 points for each incorrect guess
            }

            if (score <= 0) {
                System.out.println("Out of score. Game over!");
                break;
            }
        }

        scanner.close();
    }
}