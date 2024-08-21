public class CountingNegativeNumbers {
    public static void run() {
        int[] numbers = {-3, 5, -7, 8, -1, 2, -4};
        int count = 0;
        for (int num : numbers) {
            if (num < 0) {
                count++;
            }
        }
        System.out.println("Number of negative integers: " + count);
    }
}
