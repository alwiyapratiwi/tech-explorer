package repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariDataSource;

import entity.ToDoList;
import util.DatabaseUtil;

public class ToDoListRepositoryImplTest {

    private HikariDataSource dataSource;

    private ToDoListRepository toDoListRepository;

    @BeforeEach
    void setUp() {
        dataSource = DatabaseUtil.getDataSource();
        toDoListRepository = new ToDoListRepositoryImpl(dataSource);
    }

//    @Test
//    void testAdd() {
//        ToDoList toDoList = new ToDoList();
//        toDoList.setToDo("Alwiya Pratiwi");
//
//        toDoListRepository.add(toDoList);
//    }

    @Test
    void testRemove() {
        System.out.println(toDoListRepository.remove(1));
        System.out.println(toDoListRepository.remove(2));
        System.out.println(toDoListRepository.remove(3));
        System.out.println(toDoListRepository.remove(4));
    }

    @Test
    void testGetAll() {

        toDoListRepository.add(new ToDoList(("Alwiya")));
        toDoListRepository.add(new ToDoList(("Pratiwi")));
        toDoListRepository.add(new ToDoList(("Programmer")));

        ToDoList[] toDoLists = toDoListRepository.getAll();
        for(var todo : toDoLists) {
            System.out.println(todo.getId() + " : " + todo.getToDo());
        }

    }

    @AfterEach
    void tearDown() {
        dataSource.close();
    }
    
}
