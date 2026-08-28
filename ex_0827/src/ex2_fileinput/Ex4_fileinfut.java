package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_fileinfut {
    public static void main(String[] args) {
        File f = new File("C:/myFile/work.txt");

        //데이터를 받아올 배열을 생성하고 사이즈 할당
        byte[] read = new byte[(int)f.length()];
        FileInputStream fis = null;

        //물리적으로 존재하는지
        if(f.exists()){
            try {
                fis = new FileInputStream(f);

                fis.read(read);
                //String messege = new String(read);

                int sum = 0;
                //System.out.println(messege);

                // for(int i = 0; i < messege.length(); i++){
                //     if(messege.charAt(i) >= '0' && messege.charAt(i) <= '9'){
                //         sum += Integer.parseInt(""+messege.charAt(i));
                //     }
                // }

                // int cnt = 0;
                // while((cnt = fis.read()) != -1){
                //     try {
                //         sum+=Integer.parseInt("" + (char)cnt);
                //     } catch (Exception e) {
                //         // TODO: handle exception
                //     }
                //     //System.out.print((char)cnt);
                // }

                for(int i = 0; i < read.length; i++){
                    try {
                        sum+=Integer.parseInt("" + (char)read[i]);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }

                System.out.println("저주의 해답: " + sum);
            
            } catch (Exception e) {
                try {
                    if(fis != null)
                        fis.close();
                } catch (Exception ee) {
                    // TODO: handle exception
                }
                // TODO: handle exception
            }
        }
    }
}
