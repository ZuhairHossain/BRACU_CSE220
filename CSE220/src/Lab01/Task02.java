package Lab01;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Please enter 10 numbers");
        arr[0]=sc.nextInt();
        int maxLocation=0,minLocation=0;
        int min=arr[0], max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
                maxLocation=i;
            }
            else if(min>arr[i]){
                min=arr[i];
                minLocation=i;
            }
        }
        arr[minLocation]=max;
        arr[maxLocation]=min;

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
