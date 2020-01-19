package Lab01;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter five integer numbers");
        int arr[]=new int[5];
        int count=0;
        for (int i = 0; i < arr.length; i++) {  //takes input in array and finds how many even numbers are presents
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                count++;
            }
        }
        for(int i=0; i<arr.length-1; i++){  //sorting part
            for(int j=i+1; j<5; j++){
                if(arr[i]<arr[j]){  //large is first;small is later
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int evenArr[] = new int[count];
        count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                evenArr[count]=arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + ", ");
        }
        for (int i = 0; i < evenArr.length; i++) {
            if(i==(evenArr.length-1)){
                System.out.printf(evenArr[i] + "." + "\n");
            }
            else {
                System.out.printf(evenArr[i] + ", ");
            }
        }
    }
}
