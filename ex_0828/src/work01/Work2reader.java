package work01;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Work2reader {

    public Work2User userRead(String userID){
        String path = "c:/work/"+userID + ".sav";
        
        File f = new File("c:/work/");
        if (!f.exists())
            f.mkdirs();
        
        if(f.isDirectory()){
            // String[] names = f.list();
            // for(String str : names){
            //     System.out.println(str);
            // }
        }

        File fUser = new File(path);

        //유저 목록 탐색 없다면 추가
        //오브젝트로 저장 예정
        Work2User findU = null;
        if(!fUser.exists()){
            findU = new Work2User(userID);
            new Work2save().gameSave(findU);
            System.out.println("처음방문한 유저입니다.");

            return findU;
        } else{
            System.out.println("로드성공!");
            FileInputStream fis = null;
            ObjectInputStream ois = null;
    
            try {
                fis = new FileInputStream(fUser);
                ois = new ObjectInputStream(fis);
                findU = (Work2User)ois.readObject();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("??");
            } finally{
                try {
                    if(ois != null) ois.close();
                    if(fis != null) fis.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            findU.userinfo();
        }
        return findU;
    }
}
