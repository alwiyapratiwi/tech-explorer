package javaOOPAplikasiToDoList;

import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListService;
import service.ToDoListServiceImpl;
import view.ToDoListView;

public class AplikasiToDoList {

	public static void main(String[] args) {

		ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();			// data
		ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);	// logic bisnis
		ToDoListView toDoListView = new ToDoListView(toDoListService);					// logic view
		
		toDoListView.showToDoList();
		
	}

}
