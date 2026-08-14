package ex6_work;
import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        //1부터 100까지의 숫자 중
        //키보드에서 입력받은 수 보다 큰 첫번째
        //3의 배수를 찾아 출력
        //--------
        //입력: 55
        //55보다 큰 첫번째 3의 배수: 57
        
        Scanner sc = new Scanner(System.in);

        System.out.print("입력: ");
        int i = sc.nextInt();
        
        while(true){
            i++;
            if(i%3 == 0){
                break;
            }
        }
        System.out.println(i > 100 || i < 1 ? "1~100값이 아닙니다." : "정답: " + i);
    }
}
