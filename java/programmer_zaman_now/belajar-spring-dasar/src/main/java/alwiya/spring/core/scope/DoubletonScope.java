package alwiya.spring.core.scope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class DoubletonScope implements Scope {

    // MEMBUAT SCOPE

    private List<Object> objects = new ArrayList<>(2);

    private Long counter = -1L;

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        counter++;

        if(objects.size() == 2) {
            int index = (int) (counter % 2);
            return objects.get(index);
        } else {
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    @Override
    public String getConversationId() {
        throw new UnsupportedOperationException("Unimplemented method 'getConversationId'");
    }

    @Override
    public void registerDestructionCallback(String arg0, Runnable arg1) {
        throw new UnsupportedOperationException("Unimplemented method 'registerDestructionCallback'");
    }

    @Override
    public Object remove(String arg0) {
        if(!objects.isEmpty()) {
            return objects.remove(0);
        } 
        return null;
    }

    @Override
    public Object resolveContextualObject(String arg0) {
        throw new UnsupportedOperationException("Unimplemented method 'resolveContextualObject'");
    }
    
}
