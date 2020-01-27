package Lab03;

public class CircularArray{

    private int start;
    private int size;
    private Object [] cir;

    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object [] lin, int st, int sz){
        start = st;
        size = sz;
         cir= new Object[lin.length];
        for (int i = 0, j = start; i < sz; i++) {
            cir[st] = lin[i];
            st = (st+1) % lin.length;
        }
    }

    //Prints from index --> 0 to cir.length-1
    public void printFullLinear(){
        for (int i = 0, j= start; i < cir.length; i++) {
            if(i==(cir.length-1)){
                System.out.println(cir[i]+".");
            }
            else
                System.out.print(cir[i] + ", ");
        }
    }

    // Starts Printing from index start. Prints a total of size elements
    public void printForward(){
        for (int i = 0, j= start; i < size; i++) {
            if(i==size-1){
                System.out.println(cir[j] + ".");
            }
            else {
                System.out.print(cir[j] + ",");
                j=(j+1)%cir.length;
            }
        }
    }

    public void printBackward(){
        int k = (start + size-1) % cir.length;
        for (int i = 0; i < size; i++) {
           if(i==(size-1)){
               System.out.println(cir[k] + ".");
            }
           else
               System.out.print(cir[k]+",");
           if (k>0){
               k=k-1;
           }
           else
               k=cir.length-1;
        }
    }

    // With no null cells
    public void linearize(){

        Object l[]=new Object[size];

        for(int i=0, j=start; i<size;i++,j=(j+1)%cir.length){

            l[i]=cir[j];
        }
        cir=l;
        start=0;
        //TO DO
    }

    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity){
        //TO DO

        Object []n=new Object[newcapacity];
        int i= start;
        int j=start;

        for(int x=0; x<size;x++){
            n[i]=cir[j];
            i=(i+1)%n.length;
            j=(j+1)%cir.length;

        }
        cir=n;
    }
    /*
    //*
        // Start index becomes zero
        public void resizeByLinearize(int newcapacity){
            //TO DO

        }

        /* pos --> position relative to start. Valid range of pos--> 0 to size.
         * Increase array length by 3 if size==cir.length
         * use resizeStartUnchanged() for resizing.
         *//*
    public void insertByRightShift(Object elem, int pos){
        //TO DO
    }

    public void insertByLeftShift(Object elem, int pos){
        //TO DO
    }

    *//* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     *//*
    public void removeByLeftShift(int pos){
        //TO DO
    }

    *//* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     *//*
    public void removeByRightShift(int pos){
        //TO DO
    }


    //This method will check whether the array is palindrome or not
    public void palindromeCheck(){
        //TO DO
    }


    //This method will sort the values by keeping the start unchanged
    public void sort(){
        //TO DO
    }

    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k){
        //TO DO
        return false; // Remove this line
    }*/
}
