package test.service;

import entity.ToDoList;
import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListService;
import service.ToDoListServiceImpl;

public class ToDoListServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		testShowToDoList();
//		testAddToDoList();
//		testRemoveToDoList();

	}
	
	public static void testShowToDoList() {
		ToDoListRepositoryImpl toDoListRepository = new ToDoListRepositoryImpl();
		toDoListRepository.data[0] = new ToDoList("Belajar Java Dasar");
		toDoListRepository.data[1] = new ToDoList("Belajar Java OOP");
		toDoListRepository.data[2] = new ToDoList("Belajar Java Standard Classes");
		
		ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
		
		toDoListService.showToDoList();
	}
	
	public static void testAddToDoList() {
		ToDoListRepositoryImpl toDoListRepository = new ToDoListRepositoryImpl();
		ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
		
		toDoListService.addToDoList("Belajar Java Dasar");
		toDoListService.addToDoList("Belajar Java OOP");
		toDoListService.addToDoList("Belajar Java Standard Classes");
		
		toDoListService.showToDoList();
	}
	
	public static void testRemoveToDoList() {
		ToDoListRepositoryImpl toDoListRepository = new ToDoListRepositoryImpl();
		ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
		
		toDoListService.addToDoList("Belajar Java Dasar");
		toDoListService.addToDoList("Belajar Java OOP");
		toDoListService.addToDoList("Belajar Java Standard Classes");
		
		toDoListService.showToDoList();
		
		toDoListService.removeToDoList(5);
		toDoListService.removeToDoList(2);
		
		toDoListService.showToDoList();
	
		toDoListService.removeToDoList(2);
	
		toDoListService.showToDoList();
		
		toDoListService.removeToDoList(1);
		
		toDoListService.showToDoList();
	}

}
