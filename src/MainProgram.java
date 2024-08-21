import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Even or Odd Checker");
            System.out.println("2. Month Name Finder");
            System.out.println("3. Counting Negative Numbers");
            System.out.println("4. String Reverser");
            System.out.println("5. Fibonacci Series Generator");
            System.out.println("6. Sum Until -1 (While Loop)");
            System.out.println("7. Guess the Number (Do-While Loop)");
            System.out.println("8. First 10 Fibonacci Numbers (For Loop)");
            System.out.println("9. Even or Odd (For-Each Loop)");
            System.out.println("10. Menu-Driven Program with Jump Statements");
            System.out.println("11. Average Calculation with Break Statement");
            System.out.println("12. Sum of Numbers Greater Than 5 (Continue Statement)");
            System.out.println("13. Pathfinding in a Maze");
            System.out.println("14. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    EvenOrOddChecker.run();
                    break;
                case 2:
                    MonthNameFinder.run();
                    break;
                case 3:
                    CountingNegativeNumbers.run();
                    break;
                case 4:
                    StringReverser.run();
                    break;
                case 5:
                    FibonacciSeriesGenerator.run();
                    break;
                case 6:
                    SumUntilNegativeOne.run();
                    break;
                case 7:
                    GuessTheNumber.run();
                    break;
                case 8:
                    FirstTenFibonacci.run();
                    break;
                case 9:
                    EvenOddInArray.run();
                    break;
                case 10:
                    MenuDrivenProgram.run();
                    break;
                case 11:
                    AverageCalculator.run();
                    break;
                case 12:
                    SumGreaterThanFive.run();
                    break;
                case 13:
                    MazeSolver.solveMaze();
                    break;
                case 14:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

