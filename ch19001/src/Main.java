import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
/*
        Properties props = new Properties();
        try (InputStream in = Main.class.getResourceAsStream("message_FR.properties")) {
            props.load(in);
        } catch (IOException e) {
            // handle exception
        }
*/

        ResourceBundle bundle= ResourceBundle.getBundle("message", Locale.getDefault());
        System.out.println(Locale.getDefault());

        String greeting= bundle.getString("greeting");
        String farewell=bundle.getString("farewell");
        String namePrompt=bundle.getString("namePrompt");

        System.out.println(namePrompt);
        System.out.println(farewell);

        System.out.println(namePrompt);;
        /*
        String name= System.console().readLine();

        String formattedGreeting= MessageFormat.format(greeting,name);
        String formattedFarewell=MessageFormat.format(farewell,name);

        System.out.println(formattedGreeting);
        System.out.println(formattedFarewell);
    */

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.US);
        String formattedDate = formatter.format(now);

        System.out.println(formattedDate);
    }
}