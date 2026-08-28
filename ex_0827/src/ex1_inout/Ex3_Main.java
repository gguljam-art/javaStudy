package ex1_inout;

import java.io.File;

public class Ex3_Main {
    public static void main(String[] args) {
        String path = "C:/java";
        File f1 = new File(path);

        if(f1.isDirectory()){
            File[] flist = f1.listFiles();
            for(File value : flist){
                if(value.isFile()){
                    System.out.println(value);
                }
                // System.out.println(value);
            }
        }
    }
}
