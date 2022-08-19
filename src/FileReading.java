import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        // Reading
        try {
            FileReader reader = new FileReader("myself.txt");
            int data = reader.read();
            while (data != -1) {                // end of file, returns -1
                System.out.print((char) data);          // data value as integer casted to character
                data = reader.read(); // reads next character
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
