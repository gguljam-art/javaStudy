package work01;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        String[] strArr = {
            "Apple",
        };

        Scanner sc = new Scanner(System.in);
        String answer = "apple";
        char[] findStr = new char[answer.length()];

        for(int i = 0; i < answer.length(); i++){
            findStr[i] = '■';
        }

        while(true){
            
            System.out.println(">>");
            String inStr = sc.next();
            if(inStr.length() > 1){
                System.out.println("한글자의 영소문자만 입력 가능합니다.");
                continue;
            }
            for(int i = 0; i < answer.length(); i++){
                 if(inStr.charAt(0) == answer.charAt(i)){
                    findStr[i] = answer.charAt(i);
                    System.out.println("find");
                 }
            }

            System.out.println(findStr);
        }
    }
}
