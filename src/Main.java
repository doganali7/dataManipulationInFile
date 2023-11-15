import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int ch;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/students.txt");
        } catch (FileNotFoundException fileErrorException) {
            System.out.println("File not found");
        }

        while ((ch = fileReader.read()) != -1)
            System.out.print((char) ch);

        fileReader.close();
    }

    public static void appendToFile(String filename, String data) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}