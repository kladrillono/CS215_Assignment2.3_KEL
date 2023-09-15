/**
 * A class that creates a Node object which consists of generic T types.
 * Each node in this class contains an T item and points to the next node
 * in the list.
 * @author Kendall E. Ladrillono
 */
public class Node<T> {

	private T item;
	private Node next;
	
	/**Constructor to build Node object.
	* @param item
	*/
	public Node(T item) {
		
		this.item = item;
		this.next = null;
	}// end constructor
	
	/**Sets the item data of the object. 
	* @param item
	*/
	public void setItem(T item) {
		
		this.item = item;
	}// end setItem
	
	/**
	 * This returns the data of the object.
	 * @return item data
	 */
	public T getData() {
		
		return item;
	}// end getData
	
	/**
	 * Sets the pointer for the next node.
	 * @param next
	 */
	public void setNext(Node next) {
		
		this.next = next;
	}// end setNext
	
	/**
	 * This returns the node stored in the next node pointer.
	 * @return next Node object
	 */
	public Node getNext() {
		
		return next;
	}// end getNext
	
}// end class
