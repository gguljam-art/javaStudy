package work01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Work2save {
    public void gameSave(Work2User inUser){
        String path = "c:/work/" + inUser.getName() + ".sav";
        
        File f = new File("c:/work/");
        if(!f.exists()) f.mkdirs(); //폴더가 없으면 만들어라

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(inUser);
        } catch (Exception e) {
            System.out.println("저장하는동안 오류가 생겼습니다.");
            // TODO: handle exception
        } finally{
            try {
                if(oos != null)oos.close();
                if(fos != null)fos.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
