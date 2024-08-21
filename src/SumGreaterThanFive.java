import java.util.Scanner;

public class SumGreaterThanFive {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println("Sum of numbers greater than 5: " + sum);
    }
}

