package javaOOPAplikasiToDoList;

import javax.sql.DataSource;

import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListService;
import service.ToDoListServiceImpl;
import util.DatabaseUtil;
import view.ToDoListView;

public class AplikasiToDoList {

	public static void main(String[] args) {

		DataSource dataSource = DatabaseUtil.getDataSource();
		ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl(dataSource);			// data
		ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);	// logic bisnis
		ToDoListView toDoListView = new ToDoListView(toDoListService);					// logic view
		
		toDoListView.showToDoList();
		
	}

}
