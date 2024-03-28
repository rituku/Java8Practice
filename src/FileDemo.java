import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        /*File f = new File("C:\\dinga\\test.txt");
        f.createNewFile();*/
        /*String stringToWrite = "Java files are easy";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\newdemo\\music.txt"));
            writer.write(stringToWrite);
            writer.close();
        } catch (IOException ioe) {
            System.out.println("Couldn't write to file");
        }*/
        final String filepath3 = "userIdAndPasswordWithError.txt";
        try (BufferedWriter out = new BufferedWriter(new FileWriter(filepath3 ))) {
            out.write("testing welcome 24353\n");
            out.write(" welcome 9876");


        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader line=null;
        try {
            line = new BufferedReader(new FileReader(filepath3));
            String str =null;
            while(( str = line.readLine() )!= null) {
                System.out.println(str);
              //  UserIdAndPasswd.put(str.split(":")[0], str.split(":")[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            line.close();
        }
    }
}
