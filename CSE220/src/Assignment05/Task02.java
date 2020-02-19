package Assignment05;

public class Task02 {
    public static void main(String[] args) {
        int X= 1573 % 35; //33
        int [] cir = {X+7, X+8, 0, 0, 0, X+1, X+2, X+3, X+4, X+5, X+6};
        // 40 41 0 0 0 34 35 36 37 38 39
        print(cir,5,11);
    }

    public static void print(int []cir, int start, int size){
        int index = (start + (size -1) % cir.length);
        for (int i = index; i >= start; i--) {
            if (index == -1 ) {
                index = cir.length - 1;
            }
            if(cir[index %cir.length] % 2==0 && cir[index %cir.length]!=0) {
                System.out.println(cir[index % cir.length] + " ");
            }
            index = (index-1) % cir.length;
        }
    }

}
