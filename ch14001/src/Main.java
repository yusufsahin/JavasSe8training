import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args)  throws  Exception{
        System.out.println("Dosya kopyalanıyor...");
        Path sourcePath= Paths.get("/Users/yusufsahin/Projects/SampleProject/ch14001/src/Person.txt");
        Path targetPath=Paths.get("/Users/yusufsahin/Projects/SampleProject/ch14001/src/People.txt");
        Files.copy(sourcePath,targetPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Dosya kopyalandı");
    }
}