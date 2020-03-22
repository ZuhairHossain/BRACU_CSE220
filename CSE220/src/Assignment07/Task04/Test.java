package Assignment07.Task04;

// Java program to find factorial of given number
public class Test {
    // method to find factorial of given number
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
