package Lab04;

public class LinkedList{
  public Node head;


  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */
  public LinkedList(Object [] a){
    head = new Node(a[0], null);
    Node tail = head;
    for (int i = 1; i < a.length; i++) {
      Node k = new Node(a[i], null);
      tail.next = k;
      tail = k;
    }
  }

  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head = h;
  }

  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count=0;
    for (Node n = head; n!= null; n = n.next){
      count++;
    }
    return count;
  }

  /* prints the elements in the list */
  public void printList(){
    for(Node n = head; n!= null; n= n.next){
      System.out.print(n.element + " ");
    }
    System.out.println();
  }

  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    if(idx < 0)
      return null;
    else {
      Node n = head;
      for (int i = 0; i < idx; i++, n = n.next) {

      }
      return n;
    }
  }


  // returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    if(idx < 0)
      return null;
    else {
      Node n = head;
      for (int i = 0; i < idx; i++, n = n.next) {
      }
      return n.element;
    }
  }


  /* updates the element of the Node at the given index.
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    if(idx < 0 || idx > countNode())
      return null;
    else {
      Node node = nodeAt(idx);
      Object oldElem = node.element;
      node.element = elem;
      return oldElem;
    }
  }


  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int i = 0;
    for(Node n =head; n!= null; n = n.next, i++){
      if(n.element.equals(elem))
        return i;
    }
    return -1;
  }

  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    for(Node n =head; n!= null; n = n.next){
      if(n.element.equals(elem))
        return true;
    }
    return false;
  }

  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node copyHead = null;
    Node copyTail = null;
    for(Node n = head; n != null; n = n.next){
      Node newNode = new Node(n.element, null);
      if(copyHead == null){
        copyHead = newNode;
        copyTail = copyHead;
      }
      else{
        copyTail.next = newNode;
        copyTail = copyTail.next;
      }
    }
    return copyHead;
  }

  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
  Node newHead = null;
  for (Node n = head; n!=null; n=n.next){
    Node newNode = new Node(n.element,null);
    newNode.next = newHead;
    newHead = newNode;
  }
  return newHead;
  }

  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    if (idx < 0 || idx > countNode())
      throw new IndexOutOfBoundsException();

    Node newNode = new Node(elem, null);
    if (idx ==0){
      newNode.next = head;
      head = newNode;
    }
    else{
      Node pred = nodeAt(idx-1);
      newNode.next = pred.next;
      pred.next = newNode;
    }
  }


  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    if (index < 0 || index > countNode()) {
      return null;
    }

    if (index ==0){
      Node removedNode=head;
      Object removedElement = head.element;
      head= head.next;
      removedNode.element=null;
      removedNode.next=null;

      return removedElement;
    }
    else{
      Node pred=nodeAt(index-1);

      Node removedNode =pred.next;
      Object removedElement= pred.next.element;
      pred.next=pred.next.next;

      removedNode.element=null;
      removedNode.next=null;
      return removedElement;
    }
  }

  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    Node temp = head;
    head = head.next;
    temp.next = null;
    Node n = head;
    for ( ; n.next!=null; n=n.next){

    }
    n.next=temp;
  }

  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    Node n = head;
    for( ; n.next.next!=null; n=n.next){

    }
    Node temp = n.next;
    n.next = null;
    temp.next = head;
    head = temp;
  }

}