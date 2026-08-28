package src.ex11_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        //문제: 렌덤으로 단어를 선택한다.
        //apple이 걸렸다.
        //pealp
        //>>ealpp
        //ealpp 오답
        //>>apple
        //apple 정답을 맞췄습니다.
        
        String[] strarr = {
            "apple",
            "orange",
            "hope",
            "view"
        };

        int arrayRan = (int)(Math.random()*strarr.length);

        String str = new WorkSub().RandomString(strarr[arrayRan]);

        //-----------
        Scanner sc = new Scanner(System.in);
        System.out.println("문제: "+str);
        while(true){
            System.out.print(">>");
            String inStr = sc.next();

            boolean b = strarr[arrayRan].equals(inStr);

            if(b){
                System.out.println(inStr + " 정답입니다.");
                break;
            }
            else System.out.println(inStr + " 오답입니다.");
        }
    }
}
