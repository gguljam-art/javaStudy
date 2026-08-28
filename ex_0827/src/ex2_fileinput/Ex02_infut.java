package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex02_infut {
    public static void main(String[] args) {
        String path = "C:/myFile/test.txt";
        File f = new File(path);

        byte[] read = new byte[(int)f.length()];
        FileInputStream fis = null;
        //물리적으로존재하는지
        if(f.exists()){
            try {
                fis = new FileInputStream(f);
                fis.read(read);
                String res = new String(read);

                System.out.println(res);
            } catch (Exception e) {
                // TODO: handle exception
            } finally{
                try {
                    if(fis != null){
                        fis.close();
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
}
