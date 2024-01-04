package alwiya.spring.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data   // biar ada getter setter
public class FooBar {

    private Foo foo;

    private Bar bar;
    
}
