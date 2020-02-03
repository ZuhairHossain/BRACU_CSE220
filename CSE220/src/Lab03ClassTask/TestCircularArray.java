package Lab03ClassTask;

public class TestCircularArray{
  
  String [] cir;
  int size;
  int start;
  
  public TestCircularArray(String[] lin, int st, int sz){
    // Initialize the global variables with the local ones
    // For the array, please copy the elements one by one from lin to cir
    // DO NO copy the address
    // Copy lin[0] to cir[st]

    size = sz;
    start = st;
    cir = new String[lin.length];

    for (int i = 0; i < sz; i++) {
      cir[st] = lin[i];
      st=(st+1) % cir.length;
    }
    display();
  }

  public void sort(){
    // Sort the cir array using bubble/selection sort
    // Alert! The numbers in the array are in Strings
    // convert them to integer first
    // hint: Integer.parseInt()
    for (int i = 0; i < size -1; i++)
        {
          int min = i + start;

            for (int j = i+1; j < size; j++) {
              if (Integer.parseInt(cir[min % cir.length]) > Integer.parseInt(cir[(j + start) % cir.length])) {
                min = j + start;
              }
            }
          String temp = cir[(i+start)%cir.length];
              cir[(i+start) % cir.length] = cir[min % cir.length];
              cir[min % cir.length] = temp;
        }
        display();
  }

  public int countOdd(){
    /** From the cir array, you have to count the number of odd numbers.
     * It is not as easy as it looks. Firstly, notice that the numbers are given as strings.
     * To determine whether a number is odd,you first have to sum up the digits.
     * For example if one number is "234", you have to find the result of 2+3+4.
     * If the summation is odd then consider the number as odd.
     * Then return the count.
     **/
    int count = 0; int st = start;
     for(int i =0;i<size;i++){
       String word = cir[st];
       int num = 0;
       for(int j=0;j<word.length();j++){
         num = num + (int)(word.charAt(j));
       }
       if (num%2!=0){
         count++;
       }
       st = (st+1)%cir.length;
     }
    return count;
  }

  public int countEven(){
    /** From the cir array, you have to count the number of even numbers.
     * It is not as easy as it looks. Firstly, notice that the numbers are given as strings.
     * To determine whether a number is even, you first have to sum up the digits.
     * For example if one number is "234", you have to find the result of 2+3+4.
     * If the summation is even then consider the number as even.
     * Then return the count.
     **/

    int count = 0; int st = start;
    for(int i =0;i<size;i++){
      String word = cir[st];
      int num = 0;
      for(int j=0;j<word.length();j++){
        num = num + (int)(word.charAt(j));
      }
      if (num%2==0){
        count++;
      }
      st = (st+1)%cir.length;
    }
    return count;

  }

  public void insert(String item,int offset) throws CircularArrayException{
    /** If there are no empty spaces, throw CircularArrayException
     * This class must be created
     * you must create CircularArrayException object send the name of the particular exception as String in the constructor
     * one of them is done for you
     *
     * If there is/are empty space(s), insert using LEFT shift.
     * Offset means how far from start. The index has been calculated for you.
     * Offset cannot be more than size
     * Note that the element pointed by start will also shift, hence change the start at the end
     * increment size
     **/

    if (offset<0 || offset>size){
      throw new CircularArrayException("Invalid offset");
    }

    if (size==cir.length){
      throw new CircularArrayException("Array full");
    }

    int idx = (start+offset)%cir.length;

    for (int i = (start-1) % cir.length; i < idx; i++) {
      cir[i] = cir[i+1];
    }
    cir[idx] = item;
    if((start-1)==-1) {
      start = cir.length - 1;
    }
    start--;
    size++;
    display();
  }

  public String delete (int offset)throws CircularArrayException{
    /** If there are no empty spaces, throw CircularArrayException
     * This class must be created
     * you must send the name of the particular exception as String in the constructor
     * shown in insert()
     *
     * Delete using right shift.
     * Note that the element pointed by start will also shift, hence change the start at the end
     * decrement size
     * return the delete element
     **/

    int x = (start + offset) % cir.length;
    String remove = cir[x];
    for (int i = x; i > start; i--) {
      cir[i % cir.length] = cir[(i-1) % cir.length];
    }
    cir[start % cir.length] = null;
    size--;
    start++;

    display();
    return remove;
  }


  public void display(){
    int i = 0;
    int st = start;
    while(i<size){
      System.out.print(cir[st]+" ");
      i++;
      st = (st+1)%cir.length;
    }
    System.out.println();
  }
  
  
}