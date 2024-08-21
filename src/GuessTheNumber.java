import java.util.Scanner;

public class GuessTheNumber {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 42;
        int guess;
        do {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();
            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct!");
            }
        } while (guess != secretNumber);
    }
}
