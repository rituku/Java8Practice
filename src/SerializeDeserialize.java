import java.io.*;
import java.util.ArrayList;

public class SerializeDeserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Emp emp = new Emp(1, "ritu");
        emp = new Emp(3, "rani");
        ArrayList<Emp> arr = new ArrayList<>();
        arr.add(new Emp(1, "ritu"));
        arr.add(new Emp(2, "rani"));
        arr.add(new Emp(3, "rishav"));

        FileOutputStream fin = new FileOutputStream("ser.txt");
        ObjectOutputStream obj = new ObjectOutputStream(fin);
        obj.writeObject(arr);
        obj.flush();
        obj.close();

        FileInputStream fileInputStream = new FileInputStream("ser.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ArrayList<Emp> list = (ArrayList<Emp>) objectInputStream.readObject();
        for (int i = 0; i< list.size();i++){
            System.out.println(list.get(i));
        }

        objectInputStream.close();
        fileInputStream.close();
    }
}
