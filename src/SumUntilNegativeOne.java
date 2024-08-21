import java.util.Scanner;

public class SumUntilNegativeOne {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, num;
        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}

