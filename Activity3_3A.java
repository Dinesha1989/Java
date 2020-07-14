package JavaActivity3;


import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue <Integer> q = new LinkedList<>();
		//q.add(1);
		//q.add(2);
		//q.add(3);
		//q.add(4);
		//q.add(5);
		
		for (int i=0; i<5; i++) {
			q.add(i);
		}
		
		System.out.println("Orginal queue list: "+ q);
		System.out.println("Removing the element from the queue: "+ q.remove());
		System.out.println("Head of the queue is: "+ q.peek());
		System.out.println("Size of the queue is: "+ q.size());
		System.out.println("Update queue is: "+ q);
		System.out.println("tail of the queue is: "+ q.poll());
	}

}
