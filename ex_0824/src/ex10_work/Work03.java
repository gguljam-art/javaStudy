package ex10_work;

import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력: ");
        int n = 0;

        try {
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("입력한 값은 정수가 아닙니다.");
            return;
        }

        int sum = 0;
        while(n > 0 ){
            sum += n%10;
            n/=10;
        }

        System.out.println("결과:"+sum);
    }
}
