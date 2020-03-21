package Lab08;

public interface Queue {

    public int size();

    public boolean isEmpty();

    public void enqueue(Object e) throws QueueOverflowException;

    public Object dequeue() throws QueueUnderflowException;

    public Object peek() throws QueueUnderflowException;

    public String toString();

    public Object[] toArray();

    public int search(Object e);
}
