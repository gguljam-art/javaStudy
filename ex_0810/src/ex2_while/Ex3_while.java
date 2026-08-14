package ex2_while;
import java.util.Random;
import java.util.Scanner;

public class Ex3_while {
    public static void main(String[] args) {
        //1~100사이의 난수를 만들고
        //키보드에서 입력받은 값이 정답일 때 게임을 종료
        //----------------------------------------
        //숫자: 25
        //UP
        //숫자: 70
        //DOWN
        //숫자: 50
        //정답입니다.

        boolean b = true;
        int n = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while(b){
            System.out.print("입력: ");
            int i = sc.nextInt();
            System.out.println("값: " + i);
            
            System.out.println((i==n) ? "정답입니다." : (i < n) ? "UP" : "DOWN");
            if(i == n) b = false;
        }
    }
}
