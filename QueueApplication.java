/**
 * A class that implements a Queue and various methods to utilize.
 * This class will simulate a line of people waiting at a restaurant.
 * @author Kendall E. Ladrillono
 *
 */
public class QueueApplication {

	public static void main(String[] args) {
		
		/**Instantiates a queue. */
		Queue<String> myQueue = new Queue<String>();
		
		/**Test for enqueue with the original line order.*/
		myQueue.enqueue("Bill");
		myQueue.enqueue("Alice");
		myQueue.enqueue("Bob");
		/**Shows the original line order. */
		myQueue.display();
		/**Test for dequeue. Serves the first person in line. */
		myQueue.dequeue();
		/**Updates the line order. */
		myQueue.display();
		/**Test for a new customer arriving and added to the end of the line. */
		myQueue.enqueue("Jane");
		/**Updates the line order. */
		myQueue.display();
		myQueue.enqueue("Hamad");
		myQueue.display();
		/**Test for retrieving who is at the front of the line. */
		System.out.println(myQueue.getFront());
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.display();
		myQueue.enqueue("Jim");
		myQueue.display();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.display();	
		
	}// end main

}// end class
