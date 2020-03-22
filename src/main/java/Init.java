import java.util.ArrayList;
import java.util.List;

public class Init {


    public static void main(String[] args) {

        GenericCollection<Integer> intList = new GenericCollection<Integer>(new ArrayList<Integer>());
        intList.addElement(1);
        intList.addElement(2);
        intList.addElement(3);
        intList.display();

        GenericCollection<String> stringList = new GenericCollection<String>(new ArrayList<String>());
        stringList.addElement("1");
        stringList.addElement("2");
        stringList.addElement("3");
        stringList.display();

    }

}
