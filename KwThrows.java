import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KwThrows {
    public static String readFirstLine(String filePath) throws IOException {
        String firstLine;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            firstLine = reader.readLine();
        }
        return firstLine;
    }

    public static void main(String[] args) {
        String filePath = "example.txt";
        try {
            String firstLine = readFirstLine(filePath);
            System.out.println("First line of the file: " + firstLine);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
