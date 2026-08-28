package Work;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        //work3에서 사용자가 입력받은 값에 출현 빈도를 출력
        //---------------------------------
        //입력: 홍
        //홍의 출현 횟수: 4

        File f = new File("C:/myFile/work3.txt");
        FileInputStream fis = null;

        byte[] read = new byte[(int)f.length()];
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        String inStr = sc.next();
        int count = 0;

        if(f.exists()){
            try {
                fis = new FileInputStream(f);
                fis.read(read);
                String str = new String(read);
                for(int i = 0; i < str.length(); i++){
                    String cs = ""+str.charAt(i);
                    if(inStr.equals(cs)){
                        count ++;
                    }
                }

                if(count != 0)
                    System.out.printf("%s의 출현 횟수: %d", inStr, count);
                else
                    System.out.println(inStr + "은 존재하지 않습니다.");
            } catch (Exception e) {
                // TODO: handle exception
            }finally{
                try {
                    if(fis != null)
                        fis.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
}
