package ex1_inout;

import java.io.File;

public class Ex2_Main {
    public static void main(String[] args) {
        String path = "C:/java";
        File f = new File(path);

        if(f.isDirectory()){
            String[] names = f.list();
            for(String str : names){
                System.out.println(str);
            }
        }
        else{
            System.out.println("참조오류");
        }
    }
}
