package ex5_work;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        //id: aaa
        //pw: 1111
        //aaa/1111
        //------------
        //id: bbb
        //pw: 2222
        //>>aaa/1111
        //>>bbb/2222

        Scanner sc = new Scanner(System.in);
        
        StringBuffer list = new StringBuffer();
        // list.append(sc.next());
        // list.append("/");
        // System.out.print("pw: ");
        // list.append(sc.next());
        
        ArrayList<WorkSub> arr = new ArrayList<>();

        // while(true){
        //     StringBuffer inStr = new StringBuffer();
        //     System.out.print("id: ");
        //     inStr.append(sc.next());
        //     inStr.append("/");
        //     System.out.print("pw: ");
        //     inStr.append(sc.next());

        //     arr.add(inStr.toString());

        //     for(int i = 0; i < arr.size(); i++){
        //         System.out.println(arr.get(i));
        //     }
        // }
        // 선생님 풀이: 제네릭타입 적용

        while(true){
            WorkSub ws = new WorkSub();
            System.out.print("id: ");
            ws.setID(sc.next());
            System.out.print("pw: ");
            ws.setPW(sc.nextInt());

            boolean b = true;
            for(int i = 0; i < arr.size(); i ++){
                String getid = arr.get(i).getID();
                if(ws.getID().equals(getid)){
                    b = false;
                    break;
                }
            }

            if(b){
                arr.add(ws);
            }
            else{
                System.out.println("아이디가 중복됩니다.");
            }
        }
    }
}
