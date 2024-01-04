package service;

import entity.ToDoList;
import repository.ToDoListRepository;

public class ToDoListServiceImpl implements ToDoListService {
	
	private ToDoListRepository toDoListRepository;
	
	public ToDoListServiceImpl(ToDoListRepository toDoListRepository) {
		this.toDoListRepository = toDoListRepository;
	}

	@Override
	public void showToDoList() {
		// TODO Auto-generated method stub
		ToDoList[] model = toDoListRepository.getAll();
		
		System.out.println("== APLIKASI TO-DO-LIST ==");
		for(var i=0; i < model.length; i++) {
			var toDoList = model[i];
			var no = i + 1;
			
			if(toDoList != null) {
				System.out.println(no + ". " + toDoList.getToDo());
			}
		}
		System.out.println();
		
	}

	@Override
	public void addToDoList(String toDo) {
		// TODO Auto-generated method stub
		ToDoList toDoList = new ToDoList(toDo);
		toDoListRepository.add(toDoList);
		System.out.println("Sukses Menambahkan TODO : " + toDo);
	}

	@Override
	public void removeToDoList(Integer number) {
		// TODO Auto-generated method stub
		boolean success = toDoListRepository.remove(number);
		if(success) {
			System.out.println("Berhasil menghapus to do list : " + number);
		} else {
			System.out.println("Gagal menghapus to do list : " + number);
		}

	}

}
