package Lab01;
import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[15];
        int n=0;
        for (int i = 0; i < arr.length;) {
            n=sc.nextInt();
            if(1<=n && n<=9){
                arr[n]++;
                i++;
            }
            else{
                System.out.println("Wrong input");
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " was found " + arr[i] + " times");
        }
    }
}
