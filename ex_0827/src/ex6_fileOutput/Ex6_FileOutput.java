package ex6_fileOutput;

import java.io.File;
import java.io.FileOutputStream;

public class Ex6_FileOutput {
    public static void main(String[] args) {
        File f = new File("C:/myFile/fileOutput.txt");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(f);
            String msg = "file output stream의 예제입니다.";
            fos.write(msg.getBytes());
        } catch (Exception e) {
            // TODO: handle exception
        } finally{
            try {
                if(fos != null) fos.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
