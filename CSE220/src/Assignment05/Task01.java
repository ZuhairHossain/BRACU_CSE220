package Assignment05;

import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last 4 digit of your Student ID");
        int X = sc.nextInt() % 40;
        int Array1 [] = {X, X+10, X-100, X-20};     //initializing 1st array
        int Array2 [] = {X-20, X-30, X-60, X-40};   //initializing 2nd array

        int arr[] =appendArrays(Array1, Array2);
        printList(Array1);
        printList(Array2);
        printList(arr);
    }

    public static int[] appendArrays(int[] array1, int[] array2) {

        int appendArray[] = new int[array1.length + array2.length];
        int j=0;
        for (int i = 0; i < array1.length; i++, j++) {
            appendArray[j] = array1[i];
        }
        for (int i = 0; i < array2.length; i++, j++) {
            appendArray[j] = array2[i];
        }
        return appendArray;
    }

    public static void printList(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i==(arr.length-1))
                System.out.println(arr[i] + "." + "\n");
            else
                System.out.print(arr[i] + ", ");
        }
    }
}