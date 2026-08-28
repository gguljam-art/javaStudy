package ex6_fileOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex2_BufOutput {
    public static void main(String[] args) {
        String path = "C:/myFile/bufOutput.txt";
        File f = new File(path);

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            fos = new FileOutputStream(f);
            bos = new BufferedOutputStream(fos);

            String str = "파일을 외부에 몰래 빼돌렸다.";
            
            bos.write(str.getBytes());
        } catch (Exception e) {
            // TODO: handle exception
        } finally{
            try {
                if(bos != null) bos.close();
                if(fos != null) bos.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
