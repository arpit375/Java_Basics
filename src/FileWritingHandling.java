import java.io.*;

public class FileWritingHandling {
    public static void main(String[] args) {
        File file = new File("myself.txt");
        if (file.exists()) {
            System.out.println("file exists");
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.isFile());
//            file.delete();
        } else
            System.out.println("file does not exists");

        // Writing file
        try {
            FileWriter writer = new FileWriter("myself.txt");
            writer.write("frist file created");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
