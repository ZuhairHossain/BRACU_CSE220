package Assignment07.Task05;

public class Test {
    /* Function to calculate x raised to the power y */
    static int power(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            return power(x, y / 2) * power(x, y / 2);
        } else {
            return x * power(x, y / 2) * power(x, y / 2);
        }
    }
}
