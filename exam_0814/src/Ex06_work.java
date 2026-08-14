import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
         // 정수 : 7
        // 7은(는) 소수입니다

        // 정수 : 10
        // 10은(는) 소수가 아닙니다

        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수: ");
        int n = sc.nextInt();

        boolean b = true;

        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                b = false;
                break;
            }
        }

        if(b)
            System.out.printf("%d은(는) 소수 입니다.",n);
        else
            System.out.printf("%d은(는) 소수가 아닙니다.",n);
    }
}