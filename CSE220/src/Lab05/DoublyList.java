package Lab05;

public class DoublyList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public DoublyList(Object [] a){
    head=new Node(null,null,null); // dummy head
    Node tail=head;
    for(int i=0;i<a.length;i++){
      Node n=new Node(a[i],null,null);
      tail.next=n;
      n.prev=tail;
      tail = tail.next;
    }
    tail.next=head;
    head.prev=tail;
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public DoublyList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count=0;
     for(Node n=head.next;n!=head ;n=n.next){
    count++;
    }
    return count;
  }

  /* prints the elements in the list */
  public void forwardprint(){
    for(Node n=head.next;n!=head ;n=n.next){
    if (n.next!=head)
      System.out.print(n.element + ",");
    else
      System.out.println(n.element + ".");
    }
  }
  
  public void backwardprint(){
    for(Node n=head.prev; n!=head ;n=n.prev){
    if (n.prev!=head)
      System.out.print(n.element + ",");
    else
      System.out.println(n.element + ".");
    }
  }
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){

    if(idx>=0 && idx<countNode()){
      int c=0;
      for(Node n=head.next; n!=head;n=n.next){
        if(c==idx)
          return n;
        c++;
        
      }
    }
    return null;
  }
  
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int c=0;
    for(Node i=head.next; i!=head;i=i.next){
      if(i.element==elem)
        return c;
      c++;
    }
    return -1;
  }
  




/* inserts Node containing the given element at the given index
 * Check validity of index.
 */
public void insert(Object elem, int idx){
  // TO DO
  if(idx>=0 && idx<=countNode()){
    Node n=new Node(elem, null, null);
    Node s;
    Node p;

    if(idx==countNode())
      s=head;

    else
      s=nodeAt(idx);

    p=s.prev;
  
    n.next=s;
    n.prev=p;
    p.next=n;
    s.prev=n;
    
  }
}




/* removes Node at the given index. returns element of the removed node.
 * Check validity of index. return null if index is invalid.
 */
public Object remove(int idx){
  if(idx>=0 && idx<countNode()){
  Node n=nodeAt(idx);
  Node p=n.prev;
  Node s=n.next;
  
  p.next=s;
  s.prev=p;
  
  n.next=null;
  n.prev=null;
  return n.element;
  }
  return null;
}
}