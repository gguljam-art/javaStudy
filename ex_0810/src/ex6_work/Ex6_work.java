package ex6_work;
import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {
        //키보드에서 출력될 수열의 갯수를 지정하고
        //피보나치수열대로 결과 보여주기
        //------------------
        //입력: 7
        //1 1 2 3 5 8 13

        Scanner sc = new Scanner(System.in);
        System.out.print("입력:");
        int n = sc.nextInt();

        int x = 1;
        int y = 0;
        int sum = 1;

        String s1 = "1 1";

        for(int i = 0; i < n - 2; i++){
            y = x;
            x = sum;
            sum = x + y;
            s1 += " " + sum;
        }

        System.out.println(s1);

        //-------------
        x = 1;
        y = 0;
        sum = 1;

        for(int i = 0; i < n - 2; i++){
            y = x;
            x = sum;
            sum = x + y;
            System.out.print(sum + " ");
        }
    }
}
