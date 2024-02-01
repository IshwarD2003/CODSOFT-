import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Number!");

        while (true) {
            
            int secretNumber = new Random().nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5; 

            Scanner scanner = new Scanner(System.in);

            while (attempts < maxAttempts) {
                
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();

            
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber + "!");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum attempts. The correct number was " + secretNumber + ".");
            }

            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
    }
}