/**
 * This interface contains methods that manipulate a Queue.
 * @author Kendall E. Ladrillono
 *
 */
public interface QueueInterface<T> {

	/**
	 * Adds a new item to the queue.
	 * @param newItem
	 */
	public void enqueue(T newItem);
	/**
	 * Removes an item from the front of the queue.
	 * @return If the queue is not empty, the return
	 * statement will tell you who has been served.
	 */
	public T dequeue();
	/**
	 * Will retrieve the first position of the queue.
	 * @return The first position of the queue.
	 */
	public T getFront();
	/**
	 * Tests whether the queue is empty or not.
	 * @return True, if empty or false, if not empty.
	 */
	public boolean isEmpty();
	/**
	 * This method displays the queue in order.
	 */
	public void display();
	
}// end Queue interface
