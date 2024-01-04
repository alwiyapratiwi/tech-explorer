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
		ToDoList[] model = toDoListRepository.getAll();
		
		System.out.println("== APLIKASI TO-DO-LIST ==");

		for(var todolist : model) {
			System.out.println(todolist.getId() + "." + todolist.getToDo());
		}
		
		System.out.println();
		
	}

	@Override
	public void addToDoList(String toDo) {
		ToDoList toDoList = new ToDoList(toDo);
		toDoListRepository.add(toDoList);
		System.out.println("Sukses Menambahkan TODO : " + toDo);
	}

	@Override
	public void removeToDoList(Integer number) {
		boolean success = toDoListRepository.remove(number);
		if(success) {
			System.out.println("Berhasil menghapus to do list : " + number);
		} else {
			System.out.println("Gagal menghapus to do list : " + number);
		}

	}

}
