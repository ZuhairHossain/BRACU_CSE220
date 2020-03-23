package Assignment07.Task04;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Last 4 digit of your ID");
        int last4digit=sc.nextInt();
        System.out.println("Input last 3 digit of your ID");
        int last3digit=sc.nextInt();
        int X=((last4digit%3)+(last3digit%4)+2);
        System.out.println(X);
        int num = X; // X={(last 4 digit of your id%3)+ (last 3 digit of your id%4)+2}
        Test a = new Test();
        System.out.println("Factorial of "+ num + " is " + a.factorial(num));
    }
}

