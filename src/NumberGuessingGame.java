import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();

            if ((guess - secretNumber) >= 5) {
                System.out.println("Too high! Try again.");
            } else if (0 < (guess - secretNumber) && (guess - secretNumber) < 5) {
                System.out.println("High, but close! Try again.");
            } else if ((guess - secretNumber) <= -5) {
                System.out.println("Too low! Try again.");
            } else if ((guess - secretNumber) > -5 && (guess - secretNumber) < 0) {
                System.out.println("Low, but close! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        } while (guess != secretNumber);
    }
}