package Lab01;
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Please input ten numbers");
        arr[0] = sc.nextInt();
        int n=arr[0];
        for (int i = 1; i < arr.length; i++) {
            int check = 0;
            n = sc.nextInt();
            for (int j = 0; j <= i; j++) {
                if(n==arr[j]){
                    System.out.println(n + " is already in among the entered numbers");
                    check=1;
                    i--;
                    break;
                }
            }
         if(check==0){
             arr[i] = n;
         }
        }
        System.out.println("Good Job! Entered ten unique numbers successfully");
    }
}
