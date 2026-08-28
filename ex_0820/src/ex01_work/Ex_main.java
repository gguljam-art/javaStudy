package src.ex01_work;
import java.util.Scanner;

/**
 * Ex_main
 */
public class Ex_main {
    public static void main(String[] args) {
        //값 : 100
        //100은 숫자입니까? true
        //값: abc123
        //abc123은 숫자입니까? true

        Scanner sc = new Scanner(System.in);
        System.out.print("입력:");
        String str = sc.next();
        boolean b = new Ex_sub().strcheack(str);

        System.out.println(str + "은(는) 숫자입니까?" + b);
    }
}