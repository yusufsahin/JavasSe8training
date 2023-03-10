import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <input-file> <output-file>");
            return;
        }

        byte[] buffer= new byte[128];
        try (FileInputStream fis = new FileInputStream(args[0]);
             FileOutputStream fos = new FileOutputStream(args[1])) {

            System.out.println("Bytes available: " + fis.available());
            int count = 0;
            int read = 0;


            while ((read = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, read);
                count += read;
                System.out.println("Wrote: " + count);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}