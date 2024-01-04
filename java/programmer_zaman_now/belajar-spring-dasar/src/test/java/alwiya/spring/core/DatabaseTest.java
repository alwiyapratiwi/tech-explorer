package alwiya.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    void testSingleton() {
        // karena private jadi pakai getInstance()
        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        Assertions.assertSame(database1, database2);
    }
    
}