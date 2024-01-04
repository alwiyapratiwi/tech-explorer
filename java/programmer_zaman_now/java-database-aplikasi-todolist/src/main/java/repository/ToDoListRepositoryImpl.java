package repository;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import entity.ToDoList;

public class ToDoListRepositoryImpl implements ToDoListRepository {

	private DataSource dataSource;
	
	public ToDoListRepositoryImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public ToDoList[] getAll() {
		String sql = "SELECT id, todo FROM todolist";

		try (Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql)) 
			{

			List<ToDoList> list = new ArrayList<>();
			while (resultSet.next()) {
				ToDoList toDoList = new ToDoList();
				toDoList.setId(resultSet.getInt("id"));
				toDoList.setToDo(resultSet.getString("todo"));

				list.add(toDoList);
			}

			return list.toArray(new ToDoList[]{});

		} catch (SQLException exception) {
			throw new RuntimeException(exception);
		}
	}

	@Override
	public void add(ToDoList toDoList) {
		String sql = "INSERT INTO todolist(todo) VALUES (?)";

		try (Connection connection = dataSource.getConnection();
			PreparedStatement  statement = connection.prepareStatement(sql)) {

				statement.setString(1, toDoList.getToDo());
				statement.executeUpdate();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	private boolean isExists(Integer number) {
		String sql = "SELECT id FROM todolist WHERE id = ?";
		try(Connection connection = dataSource.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql)) {
			
			statement.setInt(1, number);

			try(ResultSet resultSet = statement.executeQuery()) {
				if(resultSet.next()) {
					return true;
				} else {
					return false;
				}
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean remove(Integer number) {

		if(isExists(number)) {
			String sql = "DELETE FROM todolist WHERE id = ?";
			try(Connection connection = dataSource.getConnection();
				PreparedStatement statement = connection.prepareStatement(sql)) {	// auto close

				statement.setInt(1, number);
				statement.executeUpdate();
				
				return true;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		} else {
			return false;
		}


	}

}
