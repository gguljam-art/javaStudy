package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex01_FileInfut {
    public static void main(String[] args) {
        //입출력 스트림의 종류
        //1)byte기반의 스트림
        //2)char기반의 스트림
        
        String path = "C:/myFile/test.txt";
        File f = new File(path);
        
        FileInputStream fis = null;
        if(f.exists()){
            //파일과 입력된 입력스트림
            try {
                fis = new FileInputStream(f);    
                int code = 0;
                //스트림은 더이상 읽을 것이 없다면 파일의 끝 (EOF)인
                //-1을 반환하게 되어있다.
                //한글은 2byte문자이기 때문에 한글을 읽는데 있어서 문제가 발생
                while( (code = fis.read()) != -1){
                    System.out.print((char)code);
                }
                //사용을 마친 스트림은 반드시 닫아줘야 한다.
            } catch (Exception e) {
                // TODO: handle exception
            } finally{
                try {
                if(fis!= null){
                    fis.close();   
                }
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
}
