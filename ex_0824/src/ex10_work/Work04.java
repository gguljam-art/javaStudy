package ex10_work;

import java.util.Scanner;

public class Work04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력: ");
        String str = sc.next();

        try {
            int n = Integer.parseInt(str);
            int len = str.length();
            if(len % 2 == 0)
                System.out.printf( "%s은(는) %d자리의 짝수 입니다."
                    , str
                    , len);
            else
                System.out.printf( "%s은(는) %d자리의 홀수 입니다."
                    , str
                    , len);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("정수가 아닙니다.");
        }
    }
}
