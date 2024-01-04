package repository;

import entity.ToDoList;

public class ToDoListRepositoryImpl implements ToDoListRepository {
	
	public ToDoList[] data = new ToDoList[10];
	
	@Override
	public ToDoList[] getAll() {
		// TODO Auto-generated method stub
		return data;
	}
	
	public boolean isFull() {
//		cek apakah model penuh?
		var isFull = true;
		for(var i = 0; i < data.length; i++) {
			if(data[i] == null) {
//				model masih ada yang kosong
				isFull = false;
				break;
			}
		}
		return isFull;
	}
	
	public void resizeIfFull() {
//		jika penuh, maka resize ukuran array model 2 kali lipat
		if(isFull()) {
//			menyimpan model lama ke var temp
			var temp = data;
			data = new ToDoList[data.length *2];
			
			for(int i = 0; i < temp.length; i++) {
				data[i] = temp[i];
			}
			
		}
	}

	@Override
	public void add(ToDoList toDoList) {
		// TODO Auto-generated method stub
		resizeIfFull();
		
//		tambahkan ke posisi yang data arraynya NULL
		for( var i=0; i < data.length; i++) {
			if(data[i] == null) {
				data[i] = toDoList;
				break;
			}
		}
	}

	@Override
	public boolean remove(Integer number) {
		// TODO Auto-generated method stub
//		cek jika number yang dimasukkan lebih dari panjang model maka false (tidak bisa dihapus)
		if((number - 1) >= data.length) {
			return false;
//		cek jika number yang dimasukkan sama dengan NULL maka FALSE (tidak bisa dihapus)
		} else if (data[number-1] == null) {
			return false;
		} else {
//			iterasi dari index yg dihapus sampai panjang modelnya
			for( int i = (number - 1); i < data.length; i ++) {
//				cek jika i sudah diujung data modelnya maka data di set = null
				if(i == (data.length-1)) {
					data[i] = null;
				} else {
//					jika bukan data yang diujung, maka set i saat ini jadi i selanjutnya
					data[i] = data[i+1];
				}
			}
			return true;
		}
	}

}
