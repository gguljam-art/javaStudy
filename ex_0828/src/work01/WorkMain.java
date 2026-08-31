package work01;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        String[] strArr = {
            "apple", "game"
        };

        Scanner sc = new Scanner(System.in);
        
        Random rd = new Random();
        String answer = strArr[rd.nextInt(2)];
        char[] findStr = new char[answer.length()];

        for(int i = 0; i < answer.length(); i++){
            findStr[i] = '■';
        }

        int findindex = 0;

        while(true){
            
            System.out.print(">>");
            String inStr = sc.next();
            if(inStr.length() > 1){
                System.out.println("한글자의 영소문자만 입력 가능합니다.");
                continue;
            }
            for(int i = 0; i < answer.length(); i++){
                 if(inStr.charAt(0) == answer.charAt(i)){
                    findStr[i] = answer.charAt(i);
                    findindex ++;
                    System.out.println("find");
                 }
            }
            if(findindex == answer.length()){
                System.out.println("정답완료!");
                break;
            }
            System.out.println(findStr);
        }
    }
}
