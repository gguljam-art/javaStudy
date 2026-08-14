package ex2_while;
import java.util.Scanner;

public class Ex2_while {
    public static void main(String[] args) {
        //입력: 1
        //값: 1
        //입력: 2
        //값: 2
        //입력 : 3
        //값: 3
        //종료됨

        boolean b = true;
        while(b){
            Scanner sc = new Scanner(System.in);
            System.out.print("입력: ");
            int n = sc.nextInt();

            System.out.println("값: " + n);
            if(n == 3) b = false;
        }
    }
}
