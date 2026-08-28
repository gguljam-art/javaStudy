package ex2_Work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        //정수: 7
        //7

        //정수: 9
        //9은(는) 소사가 아닙니다.

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("입력:");
            int n = sc.nextInt();
            
            boolean b = true;
            for(int i = 2; i <= n/2; i++){
                if(n%i == 0){
                    b = false;
                    break;
                }
            }

            if(n != 1 && b)
                System.out.println(n + "은(는) 소수입니다.");
            else if(n == -1) return;
            else
                System.out.println(n + "은(는) 소수가 아닙니다.");
        }
    }
}
