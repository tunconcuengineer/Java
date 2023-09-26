package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        String pathName = "C:\\Users\\Tunç\\Desktop\\Java\\InputOutput\\text.txt";
        File file = new File(pathName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            String text = "Writing text to a file";
            fos.write(text.getBytes());
            fos.close();
            FileInputStream fis = new FileInputStream(file);
            int i=0;    
            while((i=fis.read())!=-1){    
            System.out.print((char)i);    
            }    
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
