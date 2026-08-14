import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {
        //수1: 10
        //수2: 20
        //연산자: +
        //10 + 20 = 30

        Scanner sc = new Scanner(System.in);
        System.out.print("수1: ");
        int n1 = sc.nextInt();
        System.out.print("수2: ");
        int n2 = sc.nextInt();
        System.out.print("연산자: ");
        String s = sc.next();

        switch (s) {
            case "+":
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case "-":
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case "*":
                System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                break;
            case "x":
                System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                break;
            case "/":
                System.out.printf("%d / %d = %.2f",n1,n2, (float)n1 / n2);
                break;
            default:
                System.out.println("잘못 된 입력값");
                break;
        }
    }
}