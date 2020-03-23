package Assignment07.Task05;

public class Tester {
    public static void main(String[] args) {
        int x = ((1573 % 5) + 2);
        int y = ((573 % 3) + 1);
        System.out.println(x);
        System.out.println(y);
        Test a = new Test();
        System.out.printf("%d", a.power(x, y)); //5
    }
}
