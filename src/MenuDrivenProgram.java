import java.util.Scanner;

public class MenuDrivenProgram {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSub-Menu:");
            System.out.println("1. Print 'Hello World'");
            System.out.println("2. Print your name");
            System.out.println("3. Exit Sub-Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Your name is " + name);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

