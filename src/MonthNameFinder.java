import java.util.Scanner;

public class MonthNameFinder {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12: ");
        int month = scanner.nextInt();
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        if (month >= 1 && month <= 12) {
            System.out.println(months[month - 1]);
        } else {
            System.out.println("Invalid Month");
        }
    }
}

