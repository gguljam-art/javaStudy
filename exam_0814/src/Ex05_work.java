import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        //정수n1, n2를 입력받고
        //n1 ~ n2사이의 합을 출력
        //-----------------------
        //수1 : 2
        //수2 : 5
        //결과 : 14

        //수1 : 5
        //수2 : 2
        //결과 : 14
        
        Scanner sc = new Scanner(System.in);
        System.out.print("수1: ");
        int n1 = sc.nextInt();
        System.out.print("수2: ");
        int n2 = sc.nextInt();

        if(n1 > n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }

        int sum = 0;

        for(int i = n1; i <= n2; i++){
            sum += i;
        }

        System.out.printf("결과: %d", sum);
        
    }
}
