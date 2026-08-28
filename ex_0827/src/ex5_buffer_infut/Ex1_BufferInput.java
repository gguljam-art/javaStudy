package ex5_buffer_infut;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex1_BufferInput {
    public static void main(String[]args){
        //Buffered 스트림
        //파일을 읽거나 쓸 때 버퍼링 작업을 수행하여
        //입출력 속도 향상에 도움을 주는 스트림

        File f = new File("C:/myFile/work3.txt");
        byte[] read = new byte[(int)f.length()];

        FileInputStream fis = null;
        BufferedInputStream bis = null;

        if(f.exists()){
            try {
                fis = new FileInputStream(f);
                bis = new BufferedInputStream(fis);
                bis.read(read);

                System.out.println(new String(read));
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            } finally{
                try {
                    if(bis != null)bis.close();
                    if(fis != null)fis.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
}
