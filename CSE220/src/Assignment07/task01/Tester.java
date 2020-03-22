package Assignment07.task01;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to store in array?");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Input values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        BinarySearch a = new BinarySearch();
        outer:
        while (true) {
            System.out.println("Choose among them");
            System.out.println("1. Recursive Binary Search");
            System.out.println("2. Iterative Binary Search");
            System.out.println("3. Sum The Array Values");
            System.out.println("4. Exit");

            int b = sc.nextInt();
            switch (b) {
                case 1:
                    System.out.println("What do you want to search?");
                    int x = sc.nextInt();
                    int test1 = a.RecursiveBinarySearch(arr, 0, n - 1,x);
                    if (test1 == -1)
                        System.out.println("Element is not found");
                    else
                        System.out.println("Found: " + test1);
                    break;
                case 2:
                    int test2 = a.IterativeBinarySearch(arr, 0, n - 1);
                    if (test2 == -1)
                        System.out.println("Element is not found");
                    else
                        System.out.println("Found: " + test2);
                    break;
                case 3:
                    System.out.println("How many values do you want to add?");
                    int test3=sc.nextInt();
                    System.out.println("Sum of first "+test3+" numbers is "+a.sumValues(arr,test3));
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
                case 4:
                    break outer;
            }
        }

    }
}


