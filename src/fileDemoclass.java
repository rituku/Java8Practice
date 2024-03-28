import java.io.*;

public class fileDemoclass {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("testing.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("testing\n");
        bufferedWriter.write("3567");
        bufferedWriter.flush();
        bufferedWriter.close();

        FileReader fileReader = new FileReader("testing.txt");
        String str = null;
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }
        bufferedReader.close();
    }
}
