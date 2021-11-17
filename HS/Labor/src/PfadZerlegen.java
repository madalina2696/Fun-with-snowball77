import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class PfadZerlegen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dateipfad: ");

        String pathString = scanner.nextLine();

        String extension = "";

        int index = pathString.lastIndexOf('.');
        if (index > 0) {
            extension = pathString.substring(index + 1);
        }

        Path path = FileSystems.getDefault().getPath(pathString);

        String fileName = path.getFileName().toString();

        System.out.println("Verzeichnis: " + path.getParent());
        System.out.println("Dateiname: " + fileName.replaceAll('.' + extension, ""));
        System.out.println("Erweiterung: " + extension);

        scanner.close();
    } 
}