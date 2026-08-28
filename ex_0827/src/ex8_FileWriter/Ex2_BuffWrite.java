package ex8_FileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex2_BuffWrite {
    public static void main(String[] args) {
        File f = new File("C:/myFile/work3.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            String str = "내용이?";
            for(int i = 0; i < 3; i++){
                bw.write(str + i);
                bw.newLine();
            }

            bw.flush();
        } catch (Exception e) {
            // TODO: handle exception
        } finally{
            try {
                if(bw != null) bw.close();
                if(fw != null) fw.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
