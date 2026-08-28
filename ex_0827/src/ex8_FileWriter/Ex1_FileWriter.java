package ex8_FileWriter;

import java.io.File;
import java.io.FileWriter;

public class Ex1_FileWriter {
    public static void main(String[] args) {
        File f = new File("C:/myFile/work3.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
            String str = "내용이 자동으로 바뀌어요?";
            fw.write(str);
        } catch (Exception e) {
            // TODO: handle exception
        } finally{
            try {
                if(fw != null) fw.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
