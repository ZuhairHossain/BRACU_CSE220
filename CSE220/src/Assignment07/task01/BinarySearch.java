package Assignment07.task01;
import java.util.*;
class BinarySearch {
    Scanner sc=new Scanner(System.in);
    static int sum=0;
    // Returns index of x if it is present in arr[l..r], else return -1
    int RecursiveBinarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarea's
            if (arr[mid] > x)
                return RecursiveBinarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return RecursiveBinarySearch(arr, mid + 1, r, x);
        }
        // We reach here when element is not present
        // in array
        return -1;
    }

    int IterativeBinarySearch(int arr[], int l, int r)
    {
        System.out.println("What do you want to search?");
        int x = sc.nextInt();
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    public static int sumValues(int arr[],int n) {
        if (n<=0)
            return sum;

        return arr[n-1]+sumValues(arr,n-1);
    }
}
