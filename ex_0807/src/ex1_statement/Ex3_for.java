import java.util.Scanner;

public class Ex3_for {
    public static void main(String[] args) {
        //은행이자가 하루에 1원씩 추가
        //원금과 예치일수를 키보드에서 입력받고
        //예치기한이 끝났을 때 나의 원금이 얼마가 되어있는지 출력
        //--------------
        //원금:     (입력)1000
        //예치일:   (입력)5
        //5일 후 잔액 1005원 입니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("원금:");
        int acco = sc.nextInt();
        System.out.print("예치일:");
        int days = sc.nextInt();
        int iterst = 1; //하루이자
        int sum = 0;

        for(int i = 0; i < days; i++){
            sum += iterst;
        }

        int finalint = acco + sum;
        System.out.println(days + "일 후 잔액" + finalint + "원 입니다.");
    }
}
