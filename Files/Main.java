package Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        char[] arr = new char[100];
        File myFile = new File("C:\\Users\\Tunç\\Desktop\\Java\\Files\\txt.txt");
        FileWriter fileWriter = new FileWriter(myFile);
        fileWriter.write("Writing some text in file");
        fileWriter.close();
        FileReader fileReader = new FileReader(myFile);
        fileReader.read(arr);
        System.out.println(arr);
        fileReader.close();

        
        
        
    }
}
