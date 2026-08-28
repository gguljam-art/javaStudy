package ex10_work;

import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
        //정수: 123
        //입력받은 수: 123
        //정수: abc
        //정수만 입력할 수 있습니다.

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("정수: ");
            int n = 0;
            try {
                n = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("정수만 입력할 수 있습니다.");
                n = 0;
            }

            System.out.println("입력값:"+n);
        }
    }
}
