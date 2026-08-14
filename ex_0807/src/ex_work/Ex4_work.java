import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        //1부터 키보드에서 받은 값(n)까지의 합을 출력
        //입력: 5
        //결과: 15

        //ver1:
        Scanner sc = new Scanner(System.in);
        System.out.print("입력:");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++)
            sum += i;
        System.out.printf("결과:%d",sum);

        //ver2:
        sum = n * (n + 1) / 2;
        System.out.printf("결과:%d",sum);

        

    }
}
