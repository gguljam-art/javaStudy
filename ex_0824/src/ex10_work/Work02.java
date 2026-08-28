package ex10_work;

import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        String str = sc.next();

        try{
            int n = Integer.parseInt(str);
            System.out.println("결과: " + str);
        }catch(Exception e){
            System.out.println(str + "는(은) 정수가 아닙니다.");
        }
    }
}
