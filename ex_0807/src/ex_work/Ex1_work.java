import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        //윤년구하기
        //키보드에서 연도를 입력 받은다
        //입력받는 년도가 윤년인지 평년인지를 판단
        //----------------------
        //4로 나눠떨어지지만 100으로는 나눠떨어지지 않는 연도
        //연도가 100으로 나누어 떨어지면 평년
        //4년주기더라도 100으로 나누어 떨어지면 평년
        //단 100으로 나누어지더라도 400으로도 나눠지면 윤년
        //----------------------
        //연도 : 2020
        //2020년은 윤년입니다.
        //연도: 2021
        //2021년은 평년입니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("연도:");
        int i1 = sc.nextInt();

        if      (i1 % 400 == 0)                System.out.println(i1 + "년은 윤년입니다.");
        else if (i1 % 4 == 0 && i1 % 100 != 0) System.out.println(i1 + "년은 윤년입니다.");
        else                                   System.out.println(i1 + "년은 평년입니다.");


    }
}
