package ex6_work;
import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        // 키보드에서 입력받은 두개의 수의 최대공약수
        // ------------------
        // 수1: 10
        // 수2: 4
        // 최대공약수: 2

        Scanner sc = new Scanner(System.in);
        System.out.print("수1: ");
        int n1 = sc.nextInt();
        System.out.print("수2: ");
        int n2 = sc.nextInt();

        int m = n1 > n2 ? n1 : n2;
        int n = n1 > n2 ? n2 : n1;
        int maxn = 0;

        int offset = 0;

        for(int i = n; i > 0; i --){
            System.out.println(offset);
            if(n1%i == 0 && n2%i == 0 && i > maxn){
                maxn = i;
                break;
            }
        }

        System.out.println("최대공약수:" + maxn);

        //-----------------------------------------
        //유클리드 호제법으로 최대공약수 구하기

        while(n != 0){
            System.out.println(offset);
            int tmp = m % n;
            m = n;
            n = tmp;
        }
        System.out.println("최대공약수:" + m);
    }
}
