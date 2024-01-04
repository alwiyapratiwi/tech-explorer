package alwiya.spring.core;

public class Database {

    // membuat singleton object;

    public static Database database;

    // static method untuk membuat object dirinya sendiri
    public static Database getInstance() {
        if(database == null) {
            database = new Database();
        }
        return database;
    }

    // constructor dibuat private agar tidak bisa diakses dari luar
    private Database() {

    }
    
}
