package ex6_work;
import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        //입력받은 두 수의 최소 공배수
        //--------------
        //수1 : 6
        //수2 : 10
        //최소공배수: 30
        Scanner sc = new Scanner(System.in);
        System.out.print("수1:");
        int n1 = sc.nextInt();
        System.out.print("수2:");
        int n2 = sc.nextInt();
        int n = n1 > n2 ? n1 : n2;
        int minn = 0;

        int offset = 0;

        while(true){
            System.out.println(++offset);
            if(n%n1 == 0 && n%n2 == 0){
                minn = n;
                break;
            }
            n++;
        }

        System.out.println("최소공배수:" + minn);

        //-------------

        offset = 0;

        for(int i = 1; i <= n1*n2; i++){
            System.out.println(++offset);
            if(i % n1 == 0 && i % n2 == 0){
                System.out.println("최소공배수:" + i);
                break;
            }
        }

        //------------
        //유클리드 호제법

        int x = n1;
        int y = n2;
        offset = 0;

        while(y!=0){
            System.out.println(++offset);
            int tmp = x%y;
            x = y;
            y = tmp;
        }

        int ff = (n1*n2)/x;

        System.out.println("최소공배수:" + ff);
    }
}
