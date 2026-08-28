package ex7_FileReader;

import java.io.File;
import java.io.FileReader;

public class Ex1_FileReader {
    public static void main(String[] args) {
        String path = "C:/myFile/test.txt";
        File f = new File(path);

        FileReader fr = null;
        try {
            fr = new FileReader(path);
            int code = 0;
            while((code = fr.read())!=-1){
                System.out.print((char)code);
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally{
            try {
                if(fr != null) fr.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
