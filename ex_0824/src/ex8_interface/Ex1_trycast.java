package ex8_interface;

import java.util.Scanner;

public class Ex1_trycast {
    public static void main(String[] args) {
        //예외처리(try-catch)
        Scanner sc = new Scanner(System.in);
        System.out.print("수1: ");
        int su1 = sc.nextInt();

        System.out.print("수2: ");
        int su2 = sc.nextInt();
        
        int result = 0;

        try {
            result = su1/su2;    
        } catch (Exception e) {
            System.out.println("정수는 0으로 나눌 수 없습니다.");
        }
        
        System.out.println(result);
    }
}
