package ex7_FileReader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileReader {
    //work3를 읽어와
    //대문자와 소문자갯수를 판별하자
    //대문자: 1
    //소문자: 23

    public static void main(String[] args) {
        File f = new File("C:/myFile/work3.txt");
        FileReader fr = null;
        if(f.exists()){
            try {
                fr = new FileReader(f);
                int code = 0;

                int Acnt = 0;
                int acnt  = 0;
                int enter = 0;
                int space = 0;
                int han = 0;
                int el = 0;

                while((code = fr.read()) != -1){
                    if((char)code >= 'A' && (char)code <= 'Z')
                        Acnt ++;
                    else if((char)code >= 'a' && (char)code <= 'z')
                        acnt ++;
                    else if((char)code == '\n')
                        enter ++;
                    else if((char)code == ' ')
                        space ++;
                    else if((char)code >= '가' && (char)code <= '힣')
                        han ++;
                    else
                        el ++;
                }

                System.out.println("대문자: " + Acnt);
                System.out.println("소문자: " + acnt);
                System.out.println("앤터: " + enter);
                System.out.println("스페이스: " + space);
                System.out.println("한글: " + han);
                System.out.println("나머지: " + el);
            } catch (Exception e) {
                // TODO: handle exception
            } finally{
                try {
                    if(fr != null)fr.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
}
