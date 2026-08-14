package ex2_work;
import java.util.Scanner;

public class Ex04_work {
    public static void main(String[] args) {
        //배열의 크기를 입력하세요: 5
        //정수1: 6
        //정수2: 7
        //정수3: 11
        //정수4: 20
        //정수5: 31
        //---------------
        //홀수 개수: 3
        //짝수 개수: 2

        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요:");
        int len = sc.nextInt();
        int[] ar1=new int[len];

        int x = 0;
        int y = 0;

        for(int i = 0; i < len; i++){
            System.out.print("정수"+(i+1)+": ");
            ar1[i] = sc.nextInt();

            if(ar1[i] % 2 == 0) x ++;
            else y ++;
        }

        System.out.println("--------------------");
        System.out.println("홀수 개수:" + y);
        System.out.println("짝수 개수:" + x);

    }
}
