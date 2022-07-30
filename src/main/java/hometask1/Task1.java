package hometask1;


public class Task1 {

    public static void main(String[] args) {
        System.out.println("using for:");
        System.out.println(factorialUsingFor(-4));
        System.out.println(factorialUsingFor(0));
        System.out.println(factorialUsingFor(5));

        System.out.println("using recursion:");
        System.out.println(factorialUsingRecursion(-4));
        System.out.println(factorialUsingRecursion(0));
        System.out.println(factorialUsingRecursion(5));
    }

    public static int factorialUsingFor(int n) {
        if (n < 0) {
            System.out.println("negative numbers don't have a factorial");
            return -1;
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static int factorialUsingRecursion(int n) {
        if (n < 0) {
            System.out.println("negative numbers don't have a factorial");
            return -1;
        }

        if (n == 0) {
            return 1;
        }

        return n * factorialUsingRecursion(n - 1);
    }
}
