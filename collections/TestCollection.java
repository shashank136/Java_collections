/*methods available in Queues are 
boolean add(object)		:It is used to insert the specified element into this queue and return true upon success.
boolean offer(object)	:It is used to insert the specified element into this queue.
Object remove()			:It is used to retrieves and removes the head of this queue.
Object poll()			:It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
Object element()		:It is used to retrieves, but does not remove, the head of this queue.
Object peek()			:It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. */

import java.util.*;

class TestCollection{
	public static void main(String args[]){
		PriorityQueue<String> queue = new PriorityQueue<>();

		boolean x= queue.add("Shashank"); // public boolean add(object);
		queue.add("Kumar");
		queue.add("Rishi");
		queue.add("Hayyal");
		queue.add("Mohan");
		queue.offer("test");

		// System.out.println(x);

		System.out.println("head :"+queue.element()); // public Object element();
		System.out.println("head :"+queue.peek()); // public Object peek();
		System.out.println("Iterating the queue elements:");

		Iterator itr = queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println();
		String y = queue.remove(); // public Object remove();
		System.out.println(y);

		System.out.println();
		String z = queue.poll(); // public Object poll();
		System.out.println(z);

		System.out.println();
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}
}