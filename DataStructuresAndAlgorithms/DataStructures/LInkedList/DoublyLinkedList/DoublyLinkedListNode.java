package DataStructuresAndAlgorithms.DataStructures.LInkedList.DoublyLinkedList;

public class DoublyLinkedListNode {
    // To store the Value or data.
    int data;

    // Reference to the Previous Node
    DoublyLinkedListNode prev;
  
    // Reference to the next Node
    DoublyLinkedListNode next;
  
    // Constructor
    DoublyLinkedListNode(int d) {
       data = d;
       prev = next = null;      
    }
}
