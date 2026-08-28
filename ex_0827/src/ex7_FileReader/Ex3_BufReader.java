package ex7_FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex3_BufReader {
    public static void main(String[] args) {
        File f = new File("C:/myFile/work3.txt");
        FileReader fr = null;
        BufferedReader br = null;

        if(f.exists()){
            try {
                fr = new FileReader(f);
                br = new BufferedReader(fr);

                String msg;
                while((msg = br.readLine()) != null){
                    System.out.println(msg);
                }

            } catch (Exception e) {
                // TODO: handle exception
            } finally{
                try {
                    if(br != null)br.close();
                    if(fr != null)fr.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
}
