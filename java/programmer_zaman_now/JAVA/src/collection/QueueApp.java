package collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Queue<String> queue = new ArrayDeque<>();
		Queue<String> queue = new PriorityQueue<>();	//urut
//		Queue<String> queue = new LinkedList<>();
		
//		for(int i = 0; i < 20; i++) {
//			queue.add(String.valueOf(i));
//		}
		
		queue.add("Pratiwi");
		queue.add("Alwi");

		
		for(String next = queue.poll(); next != null; next = queue.poll()) {
			System.out.println(next);
		}
		
		System.out.println(queue.size());

	}

}
