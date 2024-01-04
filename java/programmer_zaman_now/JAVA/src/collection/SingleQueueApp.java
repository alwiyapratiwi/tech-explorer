package collection;

import java.util.Queue;

public class SingleQueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		dari yang dibuat sendiri
		Queue<String> queue = new SingleQueue<>();
		System.out.println(queue.size());
		
		System.out.println(queue.offer("Alwiya"));
		System.out.println(queue.offer("Programmer"));
		System.out.println(queue.offer("Pratiwi"));
		
		System.out.println(queue.size());
		
//		get data tetapi tidak dihapus (peek)
		System.out.println(queue.peek());
//		setelah get dihapus (poll)
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue.size());

	}

}
