package Lab08;

public class ArrayQueue implements Queue {
    public Object arr[];
    int capacity,front,size, rear;

    public ArrayQueue(int capacity){
        this.capacity=capacity;
        arr=new Object[capacity];
        this.size=0;
        front =0;
        rear = capacity-1;
    }

    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(Object e) throws QueueOverflowException {
        if(size==arr.length){
            throw new QueueOverflowException();
        } else {
            rear =(rear +1)%capacity;
            arr[rear]=e;
            size++;
        }

    }

    @Override
    public Object dequeue() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        } else {
            Object temp = arr[front];
            front = (front + 1) % capacity;
            size--;
            return temp;
        }
    }

    @Override
    public Object peek() throws QueueUnderflowException {
        if(size==0){
            throw new QueueUnderflowException();
        }
        return arr[front];
    }

    @Override
    public Object[] toArray() {
        Object temp[]=new Object[size];
        for (int i = front, j = 0; j<size; j++,i=(i+1)%arr.length){
            temp[j]=arr[i];
        }
        return temp;
    }

    @Override
    public int search(Object e) {
        return 0;
    }

}
