import java.util.Scanner;

public class FactorialCalculator {

    // Recursive function to calculate the factorial
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;  // Base case: 0! = 1
        } else {
            return n * calculateFactorial(n - 1);  // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        } else {
            long factorial = calculateFactorial(num);
            System.out.println(num + "! = " + factorial);
        }
    }
}
