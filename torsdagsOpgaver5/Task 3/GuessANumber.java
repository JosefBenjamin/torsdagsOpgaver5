import java.util.*;

public class GuessANumber {
    private static int rnd_number;
    
    public static void main(String[] args) {
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        Scanner scannerOne = new Scanner(System.in);

        if (scannerOne.hasNextDouble()) {
            double number = scannerOne.nextDouble();

            if (number == rnd_number) {
                System.out.println("Congratulations! You guessed the correct number.");
            } else if (number < rnd_number) {
                System.out.println("Your guess is too low. Try again.");
                makeAGuess();
            } else {
                System.out.println("Your guess is too high. Try again.");
                makeAGuess();
            }
        } else {
            System.out.println("That's not a valid number! Please enter a numeric value.");
            scannerOne.next();  // Consume invalid input
            makeAGuess();
        }
    }
}


// Create a Scanner object        
        // use hasNextDouble to check if input is numeric, 
        // if so...
    // Read user input
        // Compare it with the random number
        // Let the user know the result of the comparison
        // Let the user try again by calling this method recursively
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively