import java.io.*;

public class Main {
    public static void main(String[] args) {

        /*
       try
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
            bufferedWriter.write("Hello, world!");
           // bufferedWriter.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader("output.txt"));
            String line=bufferedReader.readLine();
            System.out.println(line);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}