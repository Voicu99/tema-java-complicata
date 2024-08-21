public class EvenOddInArray {
    public static void run() {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }
    }
}

