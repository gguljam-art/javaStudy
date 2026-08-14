package ex_work;
import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        //수1: 10
        //수2: 20
        //연산자: +

        Scanner sc = new Scanner(System.in);
        
        System.out.print("수1:");
        int a1 = sc.nextInt();
        System.out.print("연산자:");
        String s = sc.next();
        System.out.print("수2:");
        int a2 = sc.nextInt();
        
        int output = 0;
        switch (s) {
            case "+": output = a1 + a2;break;
            case "-": output = a1 - a2;break;
            case "*": output = a1 * a2;break;
            case "/":
                float f = (float)a1 / (float)a2; 
                System.out.println(a1 + s + a2 + "=" + f);
                return;
            default:System.out.print("잘못 입력되었습니다.");return;
        }

        System.out.println(a1 + s + a2 + "=" + output);
    }
}
