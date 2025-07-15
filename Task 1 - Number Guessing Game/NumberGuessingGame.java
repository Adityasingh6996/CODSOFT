import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain;

        do {
            int numberToGuess = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");



            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry! You've used all attempts. The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Your total score: " + score);
        scanner.close();
    }
}
