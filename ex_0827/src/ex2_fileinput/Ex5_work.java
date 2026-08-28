package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex5_work {
    public static void main(String[] args) {
        //work2의 내용을 읽어서 회문인지 판다.
        //토마토는 회문입니다.

        File f = new File("C:/myFile/work2.txt");
        byte[] inf = new byte[(int)f.length()];

        FileInputStream fis = null;

        if(f.exists()){
            try {
                fis = new FileInputStream(f);
                fis.read(inf);

                String str = new String(inf);
                String revString = new StringBuffer(str).reverse().toString();

                // for(int i = str.length()-1; i >= 0; i--){
                //     revString.append(str.charAt(i));
                // }

                if(str.equals(revString)){
                    System.out.println(str + "은(는)회문 입니다.");
                }
                else{
                    System.out.println(str + "은(는)회문이 아닙니다.");
                }

            } catch (Exception e) {

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
