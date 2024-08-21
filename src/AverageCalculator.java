import java.util.Scanner;

public class AverageCalculator {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, num;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
        //System.out.println("Average: " + (count > 0 ? (double) sum / count : "No numbers entered.")); -- mai lizibil dar e ft bine cum ai facut!
    }
}
