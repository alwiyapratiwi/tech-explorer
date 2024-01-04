package view;

import service.ToDoListService;
import util.InputUtil;

public class ToDoListView {
	
	private ToDoListService toDoListService;
	
	public ToDoListView(ToDoListService toDoListService) {
		this.toDoListService = toDoListService;
	}

	public void showToDoList() {
		while (true) {
			toDoListService.showToDoList();
			
			System.out.println("MENU : ");
			System.out.println("1. Tambah");
			System.out.println("2. Hapus");
			System.out.println("x. Keluar");
			
			var input = InputUtil.input("Pilih");
			input = input.trim();
			
			if(input.equals("1")) {
				addToDoList();
			} else if (input.equals("2")) {
				removeToDoList();
			} else if (input.equals("x")) {
				break;
			} else {
				System.out.println("Pilihan tidak dimengerti");
			}
			System.out.println();
		}
	}
	
	public void addToDoList() {
		System.out.println("== MENAMBAH TO DO LIST ==");
		
		var toDo = InputUtil.input("ToDo (x Jika Batal)");
		
		if(toDo.equals("x")) {
			// batal
		} else if (toDo.trim().equals("")) {
			System.out.println("Harap isi ToDoList");
			addToDoList();
		} else {
			toDoListService.addToDoList(toDo);
		}
	}
	
	public void removeToDoList() {
		System.out.println();
		System.out.println("== MENGHAPUS TO DO LIST ==");
		
		var number = InputUtil.input("Nomor yang akan di hapus (x Jika Batal)");
		
		if(number.equals("x")) {
			// batal
		} else if (number.trim().equals("")) {
			System.out.println("Harap isi nomor ToDoList yang ingin dihapus!");
			removeToDoList();
		} else {
//			toDoListService.removeToDoList(Integer.valueOf(number));
			try {
			    Integer todoNumber = Integer.valueOf(number);
			    toDoListService.removeToDoList(todoNumber);
			} catch (NumberFormatException e) {
			    System.out.println("Input harus berupa angka!");
			    removeToDoList();
			}

		}
		
	}

}
