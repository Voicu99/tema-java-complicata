public class FirstTenFibonacci {
    public static void run() {
        int a = 0, b = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
