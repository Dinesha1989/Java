package JavaActivity3;

import java.util.*;

public class Activity3_3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> dq = new ArrayDeque<>();
		
		
		dq.add("Tiger");
		dq.add("Lion");
		dq.addFirst("Cat");
		dq.addLast("Dog");
		dq.add("Monkey");
		dq.add("Elephant");
		dq.offerFirst("Mouse");
		
		System.out.println("Size of the queue is: "+ dq.size());
		System.out.println("elements the queue is: "+ dq);
		
		Iterator<String> iter = dq.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("Peek: " + dq.peekFirst());
		System.out.println("Peek: " + dq.peekLast());
		
		System.out.println("After Peek: "+ dq);
		
		System.out.println("Does WOLF contains: "+ dq.contains("Wolf"));
		
		String removedAnimal = dq.removeFirst();
		System.out.println("Reomved first element: "+ removedAnimal);
		
		String removedAnimal1 = dq.removeLast();
		System.out.println("Reomved first element: "+ removedAnimal1);
		
		System.out.println("Size of the queue is: "+ dq.size());
		
		}

}
