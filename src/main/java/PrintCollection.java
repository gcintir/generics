import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;
import java.util.Collection;

public class PrintCollection {


    public static void main(String[] args) {

        Collection<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        Collection<String> strings = Arrays.asList("a", "b", "c", "d", "e");
        printCollection(ints);
        printCollection(strings);

    }


    static <T> void printCollection(Collection<T> collection) {
        for (T e : collection) {
            System.out.print(e);
        }
        System.out.println();
    }



}
