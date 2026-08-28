package ex5_work;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //수1: 5
        //수2: 10
        //연산자: +
        //결과: 15
        //연산기호가 올바르지 않습니다.
        //결과: -1

        Scanner sc = new Scanner(System.in);
        System.out.print("수1:");
        int n1 = sc.nextInt();
        System.out.print("수2:");
        int n2 = sc.nextInt();
        System.out.print("연산자:");
        String s = sc.next();

        String answer = new CalculSub().calcul(n1,n2,s);

        System.out.println("결과: " + answer);
    }
}
