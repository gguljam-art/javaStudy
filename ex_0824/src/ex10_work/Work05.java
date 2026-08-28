package ex10_work;

import java.util.Scanner;

public class Work05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("수1:");
        String su1 = sc.next();
        System.out.print("수2:");
        String su2 = sc.next();

        try {
            int x1 = Integer.parseInt(su1);
            int x2 = Integer.parseInt(su2);
            int n = x1/x2;
            System.out.println("결과: " + n);
            
        } catch (Exception e) {
            // TODO: handle exception
            if(su2.equals("0"))
                System.out.println("0으로 나눌 수 없습니다.");
            else
                System.out.println("숫자가 아닙니다.");
        }
    }
}
