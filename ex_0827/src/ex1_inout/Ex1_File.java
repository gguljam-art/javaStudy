package ex1_inout;

import java.io.File;

public class Ex1_File {
    public static void main(String[] args) {
        String path = "C:\\java\\ex_0827\\test.txt";

        File f = new File(path);

        //생성한 file객체가 파일구조라면...
        if(f.isFile()){
            System.out.println("용량: " + f.length() + "byte");
        }
    }
}
