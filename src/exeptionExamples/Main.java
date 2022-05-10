package exeptionExamples;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] a = new int[10];
//        int index = scanner.nextInt();
//        if (index >= 0 && index < a.length) {
//            System.out.println(a[index]);
//        } else {
//            System.out.println("index ....");
//        }
        try {
            System.out.println(factorial(-9));
        } catch (FactorialException e) {
            e.printStackTrace();
        }
        System.out.println("here");
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            throw new FactorialException(n);
        }
        return n * factorial(n-1);
    }
}

class FactorialException extends RuntimeException {
    public FactorialException(int n) {
        super(String.valueOf(n));
    }
}
