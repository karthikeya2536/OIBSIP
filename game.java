import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 5;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 5 chances to guess the number between 1 and 100.");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                return; // Exit the game
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            attempts--;
            System.out.println("You have " + attempts + " attempts left.");
        }

        System.out.println("Sorry, you've run out of attempts. The correct number was: " + secretNumber);
    }

    
    }

