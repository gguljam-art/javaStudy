package ex3_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WorkSub1{
    File f = new File(MyPath.PATH + "test.txt");
    byte[] console = new byte[(int)f.length()];
    FileInputStream fis = null;

    public void result() throws FileNotFoundException, IOException{
        fis = new FileInputStream(f);
        fis.read( console );

        System.out.println(new String(console));

        fis.close();
    }
}
