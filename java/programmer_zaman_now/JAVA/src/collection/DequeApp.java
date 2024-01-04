package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tumpukan / stack
		Deque<String> stack = new LinkedList<>();
		
		stack.offerFirst("Zayn");
		stack.offerFirst("Alwiya");
		stack.offerFirst("Danish");
		
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		
//		antrian / queue
		Deque<String> queue = new LinkedList<>();
		
		queue.offerLast("Zayn");
		queue.offerLast("Alwiya");
		queue.offerLast("Danish");
		
		System.out.println(queue.pollFirst());
		System.out.println(queue.pollFirst());
		System.out.println(queue.pollFirst());
		
		

	}

}
