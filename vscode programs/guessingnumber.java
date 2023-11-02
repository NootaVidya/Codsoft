import java.util.Random;
import java.util.*;
public class guessingnumber
 {
        public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations, you won!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too lower than exact number. Try again:");
            } else {
                System.out.println("Your guess is too higher than exact number. Try again:");
            }
        }

        scanner.close();
    }
}
