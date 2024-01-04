package javaDasarAplikasiToDoList;

public class AplikasiToDoList {
	
//	untuk menampung isi to do list maks 10, jika melewati maka buat baru
	public static String[] model = new String[10];
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
//		testShowToDoList();
//		testAddToDoList();
//		testRemoveToDoList();
		
//		testInput();
//		testViewShowToDoList();
//		testViewAddToDoList();
//		testViewRemoveToDoList();
		
		viewShowToDoList();
		
	}
	
//	=================== BUSINESS LOGIC ==========================
	
	/**
	 * Menampilkan to do list
	 */
	public static void showToDoList() {
		System.out.println("== APLIKASI TO-DO-LIST ==");
		for(var i=0; i < model.length; i++) {
			var toDo = model[i];
			var no = i + 1;
			
			if(toDo != null) {
				System.out.println(no + ". " + toDo);
			}
		}
		System.out.println();
	}
	
	public static void testShowToDoList() {
		model[0] = "Belajar Java Dasar";
		model[1] = "Studi Kasus Java Dasar : Aplikasi ToDoList";
		model[2] = "Belajar Java Object Oriented Programming (OOP)";
		showToDoList();
	}
	
	/**
	 *  Menambah to do ke list
	 */
	public static void addToDoList(String toDo) {
//		cek apakah model penuh?
		var isFull = true;
		for(var i = 0; i < model.length; i++) {
			if(model[i] == null) {
//				model masih ada yang kosong
				isFull = false;
				break;
			}
		}
		
//		jika penuh, maka resize ukuran array model 2 kali lipat
		if(isFull) {
//			menyimpan model lama ke var temp
			var temp = model;
			model = new String[model.length *2];
			
			for(int i = 0; i < temp.length; i++) {
				model[i] = temp[i];
			}
			
		}
		
//		tambahkan ke posisi yang data arraynya NULL
		for( var i=0; i < model.length; i++) {
			if(model[i] == null) {
				model[i] = toDo;
				break;
			}
		}
		
	}
	
	public static void testAddToDoList() {
		for(var i = 0; i < 20; i++ ) {
			addToDoList("Contoh ToDo ke " + i);
		}
		
		showToDoList();
	}
	
	/**
	 * Menghapus To Do dari List
	 */
	public static boolean removeToDoList(Integer number) {
//		cek jika number yang dimasukkan lebih dari panjang model maka false (tidak bisa dihapus)
		if((number - 1) >= model.length) {
			return false;
//		cek jika number yang dimasukkan sama dengan NULL maka FALSE (tidak bisa dihapus)
		} else if (model[number-1] == null) {
			return false;
		} else {
//			iterasi dari index yg dihapus sampai panjang modelnya
			for( int i = (number - 1); i < model.length; i ++) {
//				cek jika i sudah diujung data modelnya maka data di set = null
				if(i == (model.length-1)) {
					model[i] = null;
				} else {
//					jika bukan data yang diujung, maka set i saat ini jadi i selanjutnya
					model[i] = model[i+1];
				}
			}
			return true;
		}
	}
	
	public static void testRemoveToDoList() {
		addToDoList("Satu");
		addToDoList("Dua");
		addToDoList("Tiga");
		addToDoList("Empat");
		addToDoList("Lima");
		
		var result = removeToDoList(20);
		System.out.println(result);
		
		result = removeToDoList(7);
		System.out.println(result);
		
		result = removeToDoList(2);
		System.out.println(result);
		
		showToDoList();
		
	}
	
	public static String input(String info) {
		System.out.print(info + " : ");
		String data = scanner.nextLine();
		return data;
	}
	
	public static void testInput() {
		var name = input("Nama");
		System.out.println("Hi " + name);
		
		var channel = input("Channel");
		System.out.println(channel);
		
	}
	
//	==================== VIEW ===============================
	
	/**
	 * Menampilkan view ToDOList
	 */
	public static void viewShowToDoList() {

		while (true) {
			showToDoList();
			
			System.out.println("MENU : ");
			System.out.println("1. Tambah");
			System.out.println("2. Hapus");
			System.out.println("x. Keluar");
			
			var input = input("Pilih");
			input = input.trim();
			
			if(input.equals("1")) {
				viewAddToDoList();
			} else if (input.equals("2")) {
				viewRemoveToDoList();
			} else if (input.equals("x")) {
				break;
			} else {
				System.out.println("Pilihan tidak dimengerti");
			}
			System.out.println();
		}
		
	}
	
	public static void testViewShowToDoList() {
		addToDoList("Satu");
		addToDoList("Dua");
		addToDoList("Tiga");
		addToDoList("Empat");
		addToDoList("Lima");
		
		viewShowToDoList();
	}

	/**
	 * Menampilkan view menambahkan ToDoList
	 */
	public static void viewAddToDoList() {
		System.out.println("== MENAMBAH TO DO LIST ==");
		
		var toDo = input("ToDo (x Jika Batal)");
		
		if(toDo.equals("x")) {
			// batal
		} else if (toDo.trim().equals("")) {
			System.out.println("Harap isi ToDoList");
			viewAddToDoList();
		} else {
			addToDoList(toDo);
		}
	}
	
	public static void testViewAddToDoList() {
		addToDoList("Satu");
		addToDoList("Dua");
		addToDoList("Tiga");
		
		viewAddToDoList();
		
		showToDoList();
	}
	
	/**
	 * Menampilkan view menghapus ToDoList
	 */
	public static void viewRemoveToDoList() {
		System.out.println();
		System.out.println("== MENGHAPUS TO DO LIST ==");
		
		var number = input("Nomor yang akan di hapus (x Jika Batal)");
		
		if(number.equals("x")) {
			// batal
		} else if (number.trim().equals("")) {
			System.out.println("Harap isi nomor ToDoList yang ingin dihapus!");
			viewRemoveToDoList();
		} else {
			try {
				boolean success = removeToDoList(Integer.valueOf(number));
				if(!success) {
					System.out.println("Gagal menghapus to do list : " + number);
				}
			} catch (NumberFormatException e) {
				System.out.println("Harus angka!");
				viewRemoveToDoList();
			}
		}
	}
	
	public static void testViewRemoveToDoList() {
		
		addToDoList("Satu");
		addToDoList("Dua");
		addToDoList("Tiga");
		
		showToDoList();
		
		viewRemoveToDoList();
		
		showToDoList();
	}
	
	
}
