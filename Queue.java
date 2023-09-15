/**
 * A class that models a Queue using a linked list. 
 * @author Kendall E. Ladrillono
 *
 */
public class Queue<T> implements QueueInterface<T>{
	
	private Node head;
	private Node tail;
	private int length;
	
	/**
	 * A constructor for a Queue. 
	 */
	public Queue() {
		
		head = null;
		tail = head;
		length = 0;
		
	}// end empty-argument constructor
	
	/**
	 * This method adds a new item to the end of the queue.
	 * If the queue is empty, the item to be added will be the head node.
	 * Otherwise, the item will be added to the end of the queue.
	 * @param newItem
	 */
	@Override
	public void enqueue(T newItem) {
		
		Node<T> tempNode = new Node<T>(newItem);
		if(!isEmpty()) {
			tail.setNext(tempNode);
			tail = tempNode;
		}
		else {
			head = tempNode;
			tail = head; //
		}
		length++;
		
		System.out.println(tail.getData() + " has arrived.");
		System.out.println(" ");
	}//end enqueue
	
	/**
	 * This method removes the item from the front of the queue.
	 * @return Will return a message if the queue is empty
	 * and cannot be performed.
	 */
	public T dequeue() {
		
		T message = null;
		
		System.out.println(head.getData()+" has been served.");
		System.out.println(" ");
		if(!isEmpty()) {
			head = head.getNext();
			if(head == null) {
				tail = null;
			}
		}
		else {
			System.out.println("Queue is empty, dequeue not possible.");
		}
		length--;
		return message;
	}//end dequeue
	
	/**
	 * Will check is the queue is empty.
	 * @return True if empty, false if not empty.
	 */
	public boolean isEmpty() {
		
		if (head == null) {
			return true;
		}
		else {
			return false;
		}
	}//end isEmpty
	
	/**
	 * Will determine how many items are currently in the queue.
	 * @return an integer of the items.
	 */
	public int length() {
		
		return length;
	}//end length

	/**
	 * This method will retrieve the first item in front of the queue.
	 * @return The item in the first position.
	 */
	@Override
	public T getFront() {	
		
		T message = null;
		
		if(!isEmpty()) {
			message = (T) head.getData();
		}
		return message;
	}//end getFront
	
	/**
	 * This method displays the queue in order.
	 */
	public void display() {
		
		Node first = head;
		
		if(head == null) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.println("Current line order: ");
		while(first != null) {
			System.out.println(first.getData() + " ");
			first = first.getNext();
		}
		System.out.println();
	}//end display	
	
}// end class
