import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesirializeDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("Obj.ser");
        ObjectInputStream obj = new ObjectInputStream(fin);

    }
}
