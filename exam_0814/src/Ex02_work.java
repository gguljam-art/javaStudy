import java.util.Scanner;

public class Ex02_work {
    public static void main(String[] args) {
        // 1 ~ 12월 사이의 값을 키보드에서 입력
        // 입력된 갓ㅂ에 해당하는 달이 몇일까지 있는지 출력
        //----------
        // 월: 3
        //3월은 31일까지

        //ver 1:
        Scanner sc = new Scanner(System.in);
        System.out.print("월:");
        int n = sc.nextInt();
        int n2 = 0;

        if(n == 2)
            n2 = 28;
        else if (n%2 == 0)
            n2 = (n <= 7)?30:31;
        else
            n2 = (n <= 7)?31:30;

        System.out.printf("%d월은 %d일까지\n",n,n2);

        //ver 2:
        switch (n) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            n2 = 31;
            break;
            case 4: case 6: case 9: case 11:
            n2 = 30;
            break;
            case 2:
            n2 = 28;
            break;
        }
        System.out.printf("%d월은 %d일까지",n,n2);
        
    }
}
