package collection;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

// membuat abstract class untuk buat sendiri
public class SingleQueue<E> extends AbstractQueue<E> {
	
	private E data;

	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		if(data == null) {
			data = e;
			return true;
		}
		return false;
	}

	@Override
	public E poll() {
		// TODO Auto-generated method stub
		E temp = data;
		data = null;
		return temp;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return Collections.singleton(data).iterator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data == null ? 0 : 1;
	}

	

}
