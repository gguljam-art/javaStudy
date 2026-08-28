package ex6_work;

import java.util.Scanner;

public class GradeMain {
    public static void main(String[] args) {
        //--등급기준--
        //VIP->구매금액의 10%
        //GOLD -> 5%
        //SILVER -> 3%

        //키보드에서 구매 금액과 등급을 입력받고
        //적립포인트 계산
        //----------------
        //구매 금액: 10,000
        //등급: vip
        //적립포인트: 1,000

        //구매금액: 1,000
        //등급: aaa
        //회원등급이 올바르지 않습니다.
        //적립포인트: 0

        Scanner sc = new Scanner(System.in);
        System.out.print("구매 금액: ");
        int n = sc.nextInt();
        System.out.print("등급: ");
        String rat = sc.next();
        int point = new GradeSub().grade(n, rat);

        System.out.println("적립포인트:" + point);
    }
}
