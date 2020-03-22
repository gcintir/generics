import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Collection;

public class GenericCollection<T> {

    Collection<T> data;

    public GenericCollection(Collection<T> d) {
        this.data = d;
    }

    public void addElement (T element) {
        data.add(element);
    }

    public int getSize() {
        return data.size();
    }

    public void display() {
        System.out.println(data);
    }

}
