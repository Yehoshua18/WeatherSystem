package WS1.Observables;

import java.io.IOException;
import java.io.Serializable;

public interface PersistenceImp {
    void store(String name, Serializable obj) throws IOException;
    Object retrieve(String fileName) throws IOException, ClassNotFoundException;

}
