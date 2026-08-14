package ex3_scanner;
import java.util.Scanner;

public class Ex1_scanner {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("정수:");
        int n = ns.nextInt();
        System.out.println("값"+n);

        System.out.print("문자열:");
        String s = ns.next();
        System.out.println("값:" + s);
    }
}
