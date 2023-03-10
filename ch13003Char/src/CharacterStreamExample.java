import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage: java CharacterStreamExample <input-file> <output-file>");
            return;
        }

        try (FileReader reader = new FileReader(args[0]);
             FileWriter writer = new FileWriter(args[1])) {

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

        } catch (IOException ex) {
            System.out.println("IOException: " + ex.getMessage());
        }
    }
}